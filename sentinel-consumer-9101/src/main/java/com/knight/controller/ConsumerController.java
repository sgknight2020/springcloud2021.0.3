package com.knight.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 前端控制类
 * @Author: knight
 * @Date: 2022/8/27 11:09
 */
@RestController
public class ConsumerController {
    @GetMapping("/testA")
    String testA(){
        return "testA";
    }

    @GetMapping("/testB")
    String testB(){
        return "testB";
    }
}
