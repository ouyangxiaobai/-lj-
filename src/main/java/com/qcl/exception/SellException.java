package com.qcl.exception;

import com.qcl.enums.ResultEnum;

/**
 * 编程小石头：2501902696（微信）
 */
public class SellException extends RuntimeException{

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
