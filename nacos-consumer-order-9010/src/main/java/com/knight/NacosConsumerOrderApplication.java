package com.knight;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description: 主应用类
 * @Author: knight
 * @Date: 2022/8/20 9:36
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConsumerOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosConsumerOrderApplication.class, args);
    }
}
