package com.knight.payment.dao;


import com.knight.common.entity.Payment;

/**
 * @Description: Payment
 * @Author: knight
 * @Date: Created in 2022/6/22 17:23
 */
public interface PaymentMapper {
    int create(Payment payment);
    Payment getById(Long id);
}
