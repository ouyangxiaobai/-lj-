package com.qcl.service;

import com.qcl.dataobject.User;

/**
 * 用户端
 * 编程小石头：2501902696（微信）
 */
public interface UserService {

    /**
     * 通过openid查询用户信息
     *
     * @param openid
     * @return
     */
    User findByOpenid(String openid);
}
