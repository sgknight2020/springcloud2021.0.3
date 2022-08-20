package com.knight.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description: 配置类
 * @Author: knight
 * @Date: 2022/8/20 9:39
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced
    RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
