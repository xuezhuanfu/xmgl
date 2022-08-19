package com.ytzf.demo.test.user.service.impl;

import com.ytzf.demo.test.user.entity.po.UserPO;
import com.ytzf.demo.test.user.mapper.UserMapper;
import com.ytzf.demo.test.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("userService")
public class UserserviceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserPO> findAll() {
        return userMapper.findAll();
    }

    @Override
    public UserPO login(UserPO userPO) {
        UserPO po = userMapper.queryByparam(userPO);
        if(po != null){
           if(!po.getPassword().equals(userPO.getPassword())){
               po.setErrMsg("密码错误");
           }else {
               // 测试
               po.setErrMsg("ok");
           }
        }
        return po;
    }
}
