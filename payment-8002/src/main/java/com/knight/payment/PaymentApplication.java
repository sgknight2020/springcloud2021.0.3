package com.knight.payment;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: 主服务
 * @Author: knight
 * @Date: Created in 2022/6/22 16:55
 */
@Configuration
@MapperScan("com.knight.payment.dao")
@EnableEurekaClient
@SpringBootApplication
public class PaymentApplication {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication.class, args);
    }
}
