package com.qcl.service;

import com.qcl.dataobject.SellerInfo;

/**
 * 卖家端
 * 编程小石头：2501902696（微信）
 */
public interface SellerService {

    /**
     * 通过openid查询卖家端信息
     * @return
     */
    SellerInfo findSellerInfoByPhone(String phone);
}
