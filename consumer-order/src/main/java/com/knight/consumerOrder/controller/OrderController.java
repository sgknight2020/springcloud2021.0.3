package com.knight.consumerOrder.controller;

import com.knight.common.entity.CommentResult;
import com.knight.common.entity.Payment;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Description: Order控制类
 * @Author: knight
 * @Date: Created in 2022/6/23 14:51
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Resource
    private RestTemplate restTemplate;

//    private final String PAYMENT_URL = "http://127.0.0.1:8001";
    private final String PAYMENT_URL = "http://PAYMENT-SERVER";

    @PostMapping("/create")
    CommentResult<Integer> create(@RequestBody Payment payment){
        return restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment, CommentResult.class);
    }

    @GetMapping("/get/{id}")
    CommentResult<Payment> getById(@PathVariable(name = "id") Long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommentResult.class);
    }
}
