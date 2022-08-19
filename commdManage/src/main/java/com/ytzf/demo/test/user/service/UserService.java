package com.ytzf.demo.test.user.service;

import com.ytzf.demo.test.user.entity.po.UserPO;

import java.util.List;

public interface UserService {
    List<UserPO> findAll();

    UserPO login(UserPO userPO);
}
