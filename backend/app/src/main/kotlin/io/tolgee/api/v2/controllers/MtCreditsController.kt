package io.tolgee.api.v2.controllers

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import io.tolgee.api.v2.hateoas.machineTranslation.CreditBalanceModel
import io.tolgee.constants.Message
import io.tolgee.exceptions.NotFoundException
import io.tolgee.model.Permission
import io.tolgee.model.enums.ApiScope
import io.tolgee.security.AuthenticationFacade
import io.tolgee.security.api_key_auth.AccessWithApiKey
import io.tolgee.security.project_auth.AccessWithProjectPermission
import io.tolgee.security.project_auth.ProjectHolder
import io.tolgee.service.OrganizationRoleService
import io.tolgee.service.OrganizationService
import io.tolgee.service.machineTranslation.MtCreditBucketService
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@CrossOrigin(origins = ["*"])
@RequestMapping(value = ["/v2"])
@Tag(name = "Machine translation credits")
@Suppress("SpringJavaInjectionPointsAutowiringInspection", "MVCPathVariableInspection")
class MtCreditsController(
  private val projectHolder: ProjectHolder,
  private val mtCreditBucketService: MtCreditBucketService,
  private val authenticationFacade: AuthenticationFacade,
  private val organizationRoleService: OrganizationRoleService,
  private val organizationService: OrganizationService
) {
  @GetMapping("/machine-translation-credit-balance")
  @Operation(summary = "Returns machine translation credit balance for current user")
  fun getUserCredits(): CreditBalanceModel {
    return CreditBalanceModel(mtCreditBucketService.getCreditBalance(authenticationFacade.userAccountEntity))
  }

  @GetMapping("/projects/{projectId}/machine-translation-credit-balance")
  @Operation(summary = "Returns machine translation credit balance for specified project")
  @AccessWithApiKey([ApiScope.TRANSLATIONS_EDIT])
  @AccessWithProjectPermission(Permission.ProjectPermissionType.TRANSLATE)
  fun getProjectCredits(@PathVariable projectId: Long): CreditBalanceModel {
    return CreditBalanceModel(mtCreditBucketService.getCreditBalance(projectHolder.projectEntity))
  }

  @GetMapping("/organizations/{organizationId}/machine-translation-credit-balance")
  @Operation(summary = "Returns machine translation credit balance for organization")
  fun getOrganizationCredits(@PathVariable organizationId: Long): CreditBalanceModel {
    organizationRoleService.checkUserIsMemberOrOwner(organizationId)
    organizationService.find(organizationId)?.let { o ->
      return CreditBalanceModel(mtCreditBucketService.getCreditBalance(o))
    } ?: throw NotFoundException(Message.ORGANIZATION_NOT_FOUND)
  }
}
