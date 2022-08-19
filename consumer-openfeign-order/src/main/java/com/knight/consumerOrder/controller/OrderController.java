package com.knight.consumerOrder.controller;

import com.knight.common.entity.CommentResult;
import com.knight.common.entity.Payment;
import com.knight.consumerOrder.service.PaymentClientService;
import org.springframework.web.bind.annotation.*;

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
    private PaymentClientService paymentClientService;

    @GetMapping("/get/{id}")
    CommentResult<Payment> getById(@PathVariable(name = "id") Long id) {
        return paymentClientService.getById(id);
    }
}
