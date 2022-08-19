package com.knight.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @Description: 发送消息服务
 * @Author: knight
 * @Date: 2022/8/15 16:51
 */
@Service
@Slf4j
public class SendMessageService {
    @Resource
    private StreamBridge streamBridge;

    // 发送消息
    public void send(){
        String data = UUID.randomUUID().toString();
        log.info("发送的消息: {}", data);
        streamBridge.send("output-out-0", data);
    }
}
