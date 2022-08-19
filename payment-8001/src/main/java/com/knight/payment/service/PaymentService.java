package com.knight.payment.service;

import com.knight.common.entity.CommentResult;
import com.knight.common.entity.Payment;

/**
 * @Description: Payment服务接口类
 * @Author: knight
 * @Date: Created in 2022/6/22 17:38
 */
public interface PaymentService {
    CommentResult<Integer> create(Payment payment);
    CommentResult<Payment> getById(Long id);
}
