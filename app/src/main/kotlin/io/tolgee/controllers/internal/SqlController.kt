package io.tolgee.controllers.internal

import io.swagger.v3.oas.annotations.Hidden
import io.tolgee.security.InternalController
import org.hibernate.Session
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.persistence.EntityManager

@RestController
@CrossOrigin(origins = ["*"])
@Hidden
@RequestMapping(value = ["internal/sql"])
@Transactional
@InternalController
class SqlController(
  val entityManager: EntityManager
) {

  @PostMapping(value = ["/list"])
  @Transactional
  fun getList(@RequestBody query: String): MutableList<Any?>? {
    val session = entityManager.unwrap(Session::class.java)
    return session.createNativeQuery(query).list()
  }

  @PostMapping(value = ["/execute"])
  @Transactional
  fun execute(@RequestBody query: String) {
    val session = entityManager.unwrap(Session::class.java)
    session.createNativeQuery(query).executeUpdate()
  }
}
