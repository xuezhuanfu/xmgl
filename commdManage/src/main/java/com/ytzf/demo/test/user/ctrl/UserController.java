package com.ytzf.demo.test.user.ctrl;

import com.ytzf.demo.test.user.entity.po.UserPO;
import com.ytzf.demo.test.user.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "用户模块")
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    @ApiOperation(value = "登录", notes = "登录")
    public UserPO login(@RequestBody UserPO user){
        return userService.login(user);
    }

    @GetMapping("/findAll")
    @ApiOperation(value = "查询所有用户信息", notes = "查询所有用户信息")
    public List<UserPO> findAll(){
        return userService.findAll();
    }

}
