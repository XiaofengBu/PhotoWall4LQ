package com.hhu.action;

import com.hhu.model.User;
import com.hhu.service.UserServiceI;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.net.httpserver.Authenticator;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by buxiaofeng on 17/2/28.
 */

@ParentPackage("basePackage")
@Action(value="strust2Test")
@Namespace("/")
public class TestAction extends ActionSupport{

    @Autowired
    private UserServiceI userService;

    /**
     * http://localhost:8080/strust2Test!test.action
     */
    public String test(){
        System.out.println("进入action!");
        userService.test();
        return SUCCESS;
    }
    /**
     * http://localhost:8080/strust2Test!saveUser.action
     */
    public void saveUser(){
        User user=new User();
        user.setUsername("test2");
        user.setChn_Name("test");
        user.setPassword("test");
        userService.save(user);
    }
}
