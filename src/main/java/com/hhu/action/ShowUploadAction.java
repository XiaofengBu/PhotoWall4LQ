package com.hhu.action;

import com.opensymphony.xwork2.ActionSupport;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

/**
 * Created by buxiaofeng on 17/3/15.
 */
@ParentPackage("basePackage")
@Action(value="showUpload", results ={
        @Result(name = ActionSupport.ERROR,location = "/index.jsp"),
        @Result(name = ActionSupport.SUCCESS,location = "/content/html/photoUpload.jsp")
})
@Namespace("/")
public class ShowUploadAction extends ActionSupport implements SessionAware {
    private Map session;

    public Map getSession() {
        return session;
    }

    public void setSession(Map session) {
        this.session = session;
    }

    /**
     * http://localhost:8080/showUpload!showUpload.action
     * @return
     */

    public String showUpload(){
        if(session.get("username")!=null){
            return SUCCESS;
        }
        return ERROR;
    }
}
