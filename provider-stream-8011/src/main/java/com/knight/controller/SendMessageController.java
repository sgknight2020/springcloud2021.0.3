package com.knight.controller;

import com.knight.service.SendMessageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @Description: 发送消息控制类
 * @Author: knight
 * @Date: 2022/8/15 15:46
 */
@RestController
@Slf4j
public class SendMessageController {
    @Resource
    private SendMessageService sendMessageService;

    @GetMapping("/send")
    public void send(){
        sendMessageService.send();
    }
}
