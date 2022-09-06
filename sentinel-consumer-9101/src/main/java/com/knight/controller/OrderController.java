package com.knight.controller;

import com.knight.common.entity.CommentResult;
import com.knight.common.entity.Payment;
import com.knight.service.PaymentClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description: order控制类
 * @Author: knight
 * @Date: 2022/8/2 14:32
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Resource
    private PaymentClientService paymentClientService;

    @GetMapping("/get")
    String get() {
        return paymentClientService.get();
    }
}