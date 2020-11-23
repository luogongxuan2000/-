package com.qf.service;

import com.qf.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserService {
    //登录验证
    User findByUserNameAndPassword(User user);
    //注册
    int insert(User user);
    //注册验证(根据 用户名)
    User findByTel(@Param("tel") String tel);
}
