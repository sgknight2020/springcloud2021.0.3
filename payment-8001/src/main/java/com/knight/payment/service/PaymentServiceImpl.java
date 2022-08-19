package com.knight.payment.service;

import com.knight.common.entity.CommentResult;
import com.knight.common.entity.Payment;
import com.knight.payment.dao.PaymentMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description: Payment服务类
 * @Author: knight
 * @Date: Created in 2022/6/22 17:39
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Value("${server.port}")
    String port;
    @Resource
    private PaymentMapper mapper;

    public CommentResult<Integer> create(Payment payment) {
        int result = mapper.create(payment);
        if(result > 0){
            return new CommentResult<Integer>(200, "操作成功", result);
        } else {
            return new CommentResult<Integer>(500, "操作失败", null);
        }
    }

    public CommentResult<Payment> getById(Long id) {
        if(id < 0){
            throw new RuntimeException("id不能小于0");
        }
        Payment payment = mapper.getById(id);
        if(payment == null){
            return new CommentResult<Payment>(500, "未查询到数据: " + id, null);
        } else {
            return new CommentResult<Payment>(200, port + "查询成功", payment);
        }
    }
}
