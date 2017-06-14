package com.example.demo.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author zcl
 * @date 2017/6/14
 */
@AllArgsConstructor
@Data
public class ServiceException extends RuntimeException {
    /**
     * 错误码
     */
    private Integer code;
    /**
     * 信息
     */
    private String message = "服务器错误";

    public String toString() {
        return "service exception [code=" + code + ", message=" + message + "]";
    }
}
