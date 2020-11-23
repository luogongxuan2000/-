package com.qf.pojo;

import lombok.Data;

@Data
public class User {
    private int id;//id
    private String tel; //用户名
    private String password;//密码
    private String email;//邮箱
    private String invitation;//验证码
}
