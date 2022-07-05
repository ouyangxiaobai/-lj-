package com.qcl.service;

import com.qcl.dataobject.ProductCategory;

import java.util.List;

/**
 * 类目
 * 编程小石头：2501902696（微信）
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
