package com.knight.config;

import com.knight.filter.CustomGlobalFilter;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: 网关配置
 * @Author: knight
 * @Date: 2022/8/8 14:04
 */
@Configuration
public class GateWayConfig {
    @Bean
    public GlobalFilter customFilter() {
        return new CustomGlobalFilter();
    }
}
