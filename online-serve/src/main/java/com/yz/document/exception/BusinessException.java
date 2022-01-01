package com.yz.document.exception;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author hjj
 * @create 2022/01/01/23:13
 */
public class BusinessException extends RuntimeException {
    public BusinessException(String msg) {
        super(msg);
    }
}
