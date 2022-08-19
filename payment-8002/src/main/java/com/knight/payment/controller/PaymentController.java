package com.knight.payment.controller;

import com.knight.common.entity.CommentResult;
import com.knight.common.entity.Payment;
import com.knight.payment.service.PaymentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Description: payment控制类
 * @Author: knight
 * @Date: Created in 2022/6/22 17:34
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping("/create")
    CommentResult<Integer> create(@RequestBody Payment payment){
        return paymentService.create(payment);
    }

    @GetMapping("get/{id}")
    CommentResult<Payment> getById(@PathVariable(name = "id") Long id){
        return paymentService.getById(id);
    }
}
