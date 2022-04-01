package io.tolgee.configuration

import io.sentry.spring.SentryTaskDecorator
import org.springframework.context.annotation.Configuration
import org.springframework.core.task.AsyncTaskExecutor
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor
import org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
internal class AsyncWebMvcConfiguration : WebMvcConfigurer {
  override fun configureAsyncSupport(configurer: AsyncSupportConfigurer) {
    configurer.setTaskExecutor(asyncExecutor())
  }

  private fun asyncExecutor(): AsyncTaskExecutor {
    val executor = ThreadPoolTaskExecutor()
    executor.setTaskDecorator(SentryTaskDecorator())
    executor.initialize()
    return executor
  }
}
