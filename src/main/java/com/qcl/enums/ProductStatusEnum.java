package com.qcl.enums;

import lombok.Getter;

/**
 * 商品状态
 * 编程小石头：2501902696（微信）
 */
@Getter
public enum ProductStatusEnum implements CodeEnum {
    UP(0, "在架"),
    DOWN(1, "下架")
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


}
