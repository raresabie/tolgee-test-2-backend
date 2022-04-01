package io.tolgee.openapi

import io.tolgee.fixtures.andAssertThatJson
import io.tolgee.fixtures.andIsOk
import io.tolgee.fixtures.andPrettyPrint
import io.tolgee.testing.AbstractControllerTest
import org.junit.jupiter.api.Test
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
@AutoConfigureMockMvc
class OpenApiTest : AbstractControllerTest() {

  @Test
  fun `accessible with api key is generated`() {
    performGet("/v3/api-docs/Accessible with API key").andIsOk.andAssertThatJson {
      node("paths./v2/projects/keys/{keyId}/tags.put.summary")
        .isEqualTo("Tags a key with tag. If tag with provided name doesn't exist, it is created")
    }
  }

  @Test
  fun `all internal is generated`() {
    performGet("/v3/api-docs/All Internal - for Tolgee Web application")
      .andIsOk.andPrettyPrint.andAssertThatJson {
        node("paths./v2/projects/{projectId}/keys/{keyId}/tags.put.summary")
          .isEqualTo("Tags a key with tag. If tag with provided name doesn't exist, it is created")
      }
  }
}
