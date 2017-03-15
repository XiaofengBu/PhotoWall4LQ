package com.hhu.action;

import com.hhu.model.User;
import com.hhu.service.UserServiceI;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by buxiaofeng on 17/3/1.
 */
@ParentPackage("basePackage")
@Action(value="register", results ={
        @Result(name = "success" , location = "/index.jsp"),
        @Result(name = "error" , location = "/registerError.jsp")
})
@Namespace("/")
public class RegisterAction extends ActionSupport{
    @Autowired
    private UserServiceI userService;

    private String username;
    private String password;
    private String chn_Name;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getChn_Name() {
        return chn_Name;
    }

    public void setChn_Name(String chn_Name) {
        this.chn_Name = chn_Name;
    }
    /**
     * http://localhost:8080/register!register.action
     * @return
     */
    public String register(){
        try{
            userService.register(this.username,this.chn_Name,this.password);
            return SUCCESS;
        }catch(Exception e){
            e.printStackTrace();
            return ERROR;
        }

    }
}
