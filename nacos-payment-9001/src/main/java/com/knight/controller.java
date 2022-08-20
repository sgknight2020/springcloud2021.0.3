package com.knight;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 控制层
 * @Author: knight
 * @Date: 2022/8/19 16:45
 */
@RestController
public class controller {
    @Value("${server.port}")
    private Long port;

    @GetMapping("/nacos/payment/get")
    String get(){
        return "receive get request: " + port;
    }
}
