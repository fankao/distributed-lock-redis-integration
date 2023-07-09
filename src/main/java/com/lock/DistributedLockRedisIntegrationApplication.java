package com.lock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DistributedLockRedisIntegrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(DistributedLockRedisIntegrationApplication.class, args);
    }

}
