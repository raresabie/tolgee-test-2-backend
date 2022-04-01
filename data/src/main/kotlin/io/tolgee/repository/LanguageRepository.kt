package io.tolgee.repository

import io.tolgee.model.Language
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface LanguageRepository : JpaRepository<Language, Long> {
  fun findByTagAndProject(abbreviation: String, project: io.tolgee.model.Project): Optional<Language>
  fun findByNameAndProject(name: String?, project: io.tolgee.model.Project): Optional<Language>
  fun findByTagAndProjectId(abbreviation: String?, projectId: Long): Optional<Language>
  fun findAllByProjectId(projectId: Long?): Set<Language>
  fun findAllByProjectId(projectId: Long?, pageable: Pageable): Page<Language>
  fun findAllByTagInAndProjectId(abbreviation: Collection<String?>?, projectId: Long?): Set<Language>
  fun deleteAllByProjectId(projectId: Long?)
  fun countByIdInAndProjectId(languageIds: Set<Long>, projectId: Long): Int
}
