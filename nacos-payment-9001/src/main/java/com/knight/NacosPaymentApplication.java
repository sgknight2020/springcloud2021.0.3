package com.knight;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description: 主应用类
 * @Author: knight
 * @Date: 2022/8/19 16:40
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosPaymentApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosPaymentApplication.class, args);
    }
}
