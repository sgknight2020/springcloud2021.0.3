package com.knight.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Description: 前端控制类
 * @Author: knight
 * @Date: 2022/8/20 9:38
 */
@RestController
public class OrderController {
    @Resource
    private RestTemplate restTemplate;

    String SERVER_URL = "http://nacos-payment";

    @GetMapping("/consumer/get")
    String get(){
        return  restTemplate.getForObject(SERVER_URL + "/nacos/payment/get", String.class);
    }
}
