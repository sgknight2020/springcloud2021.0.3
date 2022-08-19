package com.knight.consumerOrder;

import com.knight.consumerOrder.config.LoadBalancerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description: 主应用
 * @Author: knight
 * @Date: Created in 2022/6/23 14:44
 */
@EnableEurekaClient
@SpringBootApplication
@LoadBalancerClient(name = "PAYMENT-SERVER", configuration = LoadBalancerConfig.class)
public class ConsumerOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerOrderApplication.class, args);
    }
}
