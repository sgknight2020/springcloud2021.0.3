package com.knight;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description: 主应用类
 * @Author: knight
 * @Date: 2022/8/2 14:31
 */
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
public class ConsumerHystrixOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerHystrixOrderApplication.class, args);
    }
}
