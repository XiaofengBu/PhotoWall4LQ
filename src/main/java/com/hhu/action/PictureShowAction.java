package com.hhu.action;

import com.hhu.model.Picture;
import com.hhu.service.PictureServiceI;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by buxiaofeng on 17/3/9.
 */

@ParentPackage("basePackage")
@Action(value="pictureShow", results ={
        @Result(name = "success",location = "/content/html/photoShow.jsp"),
})
@Namespace("/")
public class PictureShowAction extends ActionSupport implements SessionAware{
    @Autowired
    private PictureServiceI pictureService;

    private Map session;

    public Map getSession() {
        return session;
    }

    public void setSession(Map session) {
        this.session = session;
    }

    /**
     * http://localhost:8080/pictureShow!showPictureList.action
     * @return
     */

    public String showPictureList(){
        String username=(String)session.get("username");
        List<Picture> pictureList=new ArrayList<Picture>();
        if(username!=null){
            pictureList=pictureService.getPictureList(username);
        }
        ServletActionContext.getRequest().setAttribute("pictureList", pictureList);
        return SUCCESS;
    }
}
