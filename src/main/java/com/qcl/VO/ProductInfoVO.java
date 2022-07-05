package com.qcl.VO;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

import lombok.Data;

/**
 * 商品详情
 * 编程小石头：2501902696（微信）
 */
@Data
public class ProductInfoVO {

    @JsonProperty("id")
    private String productId;

    @JsonProperty("name")
    private String productName;

    @JsonProperty("price")
    private BigDecimal productPrice;

    /** 库存. */
    @JsonProperty("stock")
    private Integer productStock;

    @JsonProperty("desc")
    private String productDescription;

    @JsonProperty("icon")
    private String productIcon;
}
