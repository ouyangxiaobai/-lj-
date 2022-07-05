package com.qcl.dto;

import lombok.Data;

/**
 * 购物车
 * 编程小石头：2501902696（微信）
 */
@Data
public class CartDTO {

    /** 商品Id. */
    private String productId;

    /** 数量. */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
