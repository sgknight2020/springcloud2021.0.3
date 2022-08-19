package com.knight.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description: 返回结果集
 * @Author: knight
 * @Date: Created in 2022/6/22 17:27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentResult<T> {
    private int code;
    private String message;
    private T data;

    CommentResult(int code, String message){
        this.code = code;
        this.message = message;
        this.data = null;
    }
}
