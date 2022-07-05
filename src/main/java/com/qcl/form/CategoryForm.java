package com.qcl.form;

import lombok.Data;

/**
 * 编程小石头：2501902696（微信）
 */
@Data
public class CategoryForm {

    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;
}
