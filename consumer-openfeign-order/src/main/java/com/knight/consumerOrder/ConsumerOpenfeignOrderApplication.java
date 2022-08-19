package com.knight.consumerOrder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description: 主应用
 * @Author: knight
 * @Date: Created in 2022/6/23 14:44
 */
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
public class ConsumerOpenfeignOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerOpenfeignOrderApplication.class, args);
    }
}
