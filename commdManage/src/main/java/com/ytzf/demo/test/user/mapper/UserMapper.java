package com.ytzf.demo.test.user.mapper;

import com.ytzf.demo.test.user.entity.po.UserPO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    public List<UserPO> findAll();

    UserPO queryByparam(UserPO userPO);
}
