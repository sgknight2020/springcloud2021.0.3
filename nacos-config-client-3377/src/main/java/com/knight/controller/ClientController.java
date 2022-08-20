package com.knight.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 前端控制类
 * @Author: knight
 * @Date: 2022/8/20 16:21
 */
@RestController
@RefreshScope
public class ClientController {
    @Value("${config.info}")
    String configInfo;

    @GetMapping("/configInfo")
    String getConfigInfo(){
        return configInfo;
    }
}
