package com.hhu.action;

import com.hhu.service.UserServiceI;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * Created by buxiaofeng on 17/2/28.
 */

@ParentPackage("basePackage")
@Action(value="login", results ={
        @Result(name = "success",location = "/content/html/photoWall.jsp"),
        @Result(name = "error",location = "/loginError.jsp")
})
@Namespace("/")
public class LoginAction extends ActionSupport implements SessionAware{
    @Autowired
    private UserServiceI userService;

    private Map session;

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

    public void setSession(Map session){
        this.session=session;
    }

    /**
     * http://localhost:8080/login!login.action
     * @return
     */
    public String login(){
        try {
            if (userService.isLogin(this.username, this.password)) {
                session.put("username",this.username);
                ServletActionContext.getRequest().setAttribute("CHN_NAME", userService.getCHN_Name(username));
                return SUCCESS;
            }
        }catch (Exception e){
            e.printStackTrace();
            return ERROR;
        }
        return ERROR;
    }
}
