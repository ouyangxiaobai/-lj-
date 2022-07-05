package com.qcl.repository;

import com.qcl.dataobject.SellerInfo;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 编程小石头：2501902696（微信）
 */
public interface SellerInfoRepository extends JpaRepository<SellerInfo, Integer> {
    SellerInfo findByPhone(String phone);

    SellerInfo findBySellerId(Integer sellerId);
}
