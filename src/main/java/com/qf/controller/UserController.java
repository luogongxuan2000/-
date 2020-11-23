package com.qf.controller;

import com.qf.pojo.User;
import com.qf.service.UserService;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

@Component
@RequestMapping("/user")
@SessionAttributes({"tel"})
public class UserController {
    @Autowired
    UserService userService;
    @ResponseBody
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    //登陆
    public String login(User user, Model model){
        //if tel 和 password 均不为空 和 空串 则登陆通过
        if (user.getTel()!=null && !StringUtils.isEmpty(user.getTel()) && user.getPassword()!=null && !StringUtils.isEmpty(user.getPassword())){
            User res = userService.findByUserNameAndPassword(user);
            if ( res != null){  //说明登陆通过
                model.addAttribute("tel",res.getTel());
                return "{\"code\":1}";
            }
        }
        return "{\"code\":0}";
    }
    //注册
    @ResponseBody
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String register(User user){
        User byTel = userService.findByTel(user.getTel());
        if (byTel == null){//当前用户名 未被使用
            int insert = userService.insert(user);
            if (insert > 0){
                return "{\"code\":1}";
            }
        }
        return "{\"code\":0}";
    }
}
