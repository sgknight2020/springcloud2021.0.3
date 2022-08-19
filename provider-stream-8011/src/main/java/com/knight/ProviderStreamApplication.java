package com.knight;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description: 主应用类
 * @Author: knight
 * @Date: 2022/8/15 15:00
 */
@EnableEurekaClient
@SpringBootApplication
public class ProviderStreamApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderStreamApplication.class, args);
    }
}
