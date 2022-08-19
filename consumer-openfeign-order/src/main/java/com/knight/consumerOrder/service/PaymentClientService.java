package com.knight.consumerOrder.service;

import com.knight.common.entity.CommentResult;
import com.knight.common.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Description: 支付服务接口
 * @Author: knight
 * @Date: Created in 2022/7/20 9:19
 */
@FeignClient(name = "PAYMENT-SERVER")
public interface PaymentClientService {
    @GetMapping("/payment/get/{id}")
    CommentResult<Payment> getById(@PathVariable(name = "id") Long id);
}
