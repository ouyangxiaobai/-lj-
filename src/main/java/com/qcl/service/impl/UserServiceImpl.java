package com.qcl.service.impl;

import com.qcl.dataobject.User;
import com.qcl.repository.UserRepository;
import com.qcl.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 编程小石头：2501902696（微信）
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User findByOpenid(String openid) {
        return repository.findByOpenid(openid);
    }
}
