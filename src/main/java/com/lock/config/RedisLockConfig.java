package com.lock.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.integration.redis.util.RedisLockRegistry;
import org.springframework.integration.support.locks.ExpirableLockRegistry;

import java.time.Duration;

@Configuration
public class RedisLockConfig {
    private static final String LOCK_NAME = "INGESTION_EVENT_LOCK";
    private static final Duration RELEASE_TIME_DURATION = Duration.ofSeconds(30);

    @Bean(LOCK_NAME)
    public ExpirableLockRegistry redisLockRegistry(RedisConnectionFactory redisConnectionFactory) {
        return new RedisLockRegistry(redisConnectionFactory, LOCK_NAME,RELEASE_TIME_DURATION.toMillis());
    }
}
