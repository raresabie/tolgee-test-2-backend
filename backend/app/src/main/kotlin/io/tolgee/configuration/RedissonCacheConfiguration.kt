package io.tolgee.configuration

import io.tolgee.configuration.tolgee.TolgeeProperties
import io.tolgee.constants.Caches
import org.redisson.Redisson
import org.redisson.api.RedissonClient
import org.redisson.spring.cache.CacheConfig
import org.redisson.spring.cache.RedissonSpringCacheManager
import org.springframework.boot.autoconfigure.AutoConfigureAfter
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.cache.CacheManager
import org.springframework.cache.annotation.EnableCaching
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.redis.core.RedisOperations

@Configuration
@EnableCaching
@ConditionalOnClass(Redisson::class, RedisOperations::class)
@AutoConfigureAfter(ConditionalRedissonAutoConfiguration::class)
@ConditionalOnProperty(name = ["tolgee.cache.use-redis"], havingValue = "true")
class RedissonCacheConfiguration(private val tolgeeProperties: TolgeeProperties) {
  @Bean
  fun cacheManager(redissonClient: RedissonClient): CacheManager? {
    val config: MutableMap<String, CacheConfig> = HashMap()
    Caches.caches.forEach {
      config[it] = CacheConfig(tolgeeProperties.cache.defaultTtl, tolgeeProperties.cache.defaultTtl)
    }
    return RedissonSpringCacheManager(redissonClient, config)
  }
}
