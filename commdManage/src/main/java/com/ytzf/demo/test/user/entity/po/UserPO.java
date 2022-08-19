package com.ytzf.demo.test.user.entity.po;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class UserPO implements Serializable {

    @ApiModelProperty(value = "用户id")
    private Integer userId;
    @ApiModelProperty(value = "用户名")
    private String userName;
    @ApiModelProperty(value = "用户密码")
    private String password;
    private String errMsg;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
}
