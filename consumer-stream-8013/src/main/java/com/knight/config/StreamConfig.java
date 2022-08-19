package com.knight.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

/**
 * @Description: stream 配置类
 * @Author: knight
 * @Date: 2022/8/15 16:32
 */
@Configuration
@Slf4j
public class StreamConfig {
    @Bean
    public Consumer<String> input() {
        return (data) -> log.info("收到的消息：{}", data);
    }
}
