package com.knight;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description: 主应用类
 * @Author: knight
 * @Date: 2022/8/27 11:08
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SentinelConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SentinelConsumerApplication.class, args);
    }
}
