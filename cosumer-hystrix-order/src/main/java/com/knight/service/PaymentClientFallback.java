package com.knight.service;

import com.knight.common.entity.CommentResult;
import com.knight.common.entity.Payment;
import org.springframework.stereotype.Component;

/**
 * @Description: FallbackFactory
 * @Author: knight
 * @Date: 2022/8/2 14:43
 */
@Component
public class PaymentClientFallback implements PaymentClientService  {
    public CommentResult<Payment> getById(Long id) {
        return new CommentResult<Payment>(500,"服务调用失败，请稍后重试", null);
    }
}
