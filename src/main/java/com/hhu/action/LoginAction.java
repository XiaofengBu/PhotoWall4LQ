package com.hhu.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

/**
 * Created by buxiaofeng on 17/2/28.
 */

@ParentPackage("basePackage")
@Action(value="login", results ={
        @Result(name = "success",location = "/wallDemo.jsp")
})
@Namespace("/")
public class LoginAction extends ActionSupport{
    private String username;
    private String password;
    private String checkbox;



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

    public String getCheckbox() {
        return checkbox;
    }

    public void setCheckbox(String checkbox) {
        this.checkbox = checkbox;
    }

    /**
     * http://localhost:8080/login!login.action
     * @return
     */
    public String login(){
        System.out.println(this.username);
        return SUCCESS;
    }
}
