/*
 * Copyright (c) 2020. Tolgee
 */

package io.tolgee.controllers

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import io.tolgee.dtos.request.GenerateSlugDto
import io.tolgee.service.OrganizationService
import io.tolgee.service.ProjectService
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
@CrossOrigin(origins = ["*"])
@RequestMapping(value = ["/v2/slug", "/api/address-part"])
@Tag(name = "Slug generation")
class SlugController(
  private val organizationService: OrganizationService,
  private val projectService: ProjectService,
) {

  @GetMapping("/validate-organization/{slug}")
  @Operation(summary = "Validate organization address part")
  fun validateOrganizationSlug(
    @PathVariable("slug") slug: String
  ): Boolean {
    return organizationService.validateSlugUniqueness(slug)
  }

  @GetMapping("/validate-project/{slug}")
  @Operation(summary = "Validate project address part")
  fun validateProjectSlug(
    @PathVariable("slug") slug: String
  ): Boolean {
    return projectService.validateSlugUniqueness(slug)
  }

  @PostMapping("/generate-organization", produces = [MediaType.APPLICATION_JSON_VALUE])
  @Operation(summary = "Generate organization address part")
  fun generateOrganizationSlug(
    @RequestBody @Valid dto: GenerateSlugDto
  ): String {
    return """"${organizationService.generateSlug(dto.name!!, dto.oldSlug)}""""
  }

  @PostMapping("/generate-project", produces = [MediaType.APPLICATION_JSON_VALUE])
  @Operation(summary = "Generate project address part")
  fun generateProjectSlug(
    @RequestBody @Valid dto: GenerateSlugDto
  ): String {
    return """"${projectService.generateSlug(dto.name!!, dto.oldSlug)}""""
  }
}
