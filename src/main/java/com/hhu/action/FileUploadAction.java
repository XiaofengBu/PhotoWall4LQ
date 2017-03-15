package com.hhu.action;

import com.hhu.service.PictureServiceI;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.util.Map;

/**
 * Created by buxiaofeng on 17/3/8.
 */
@ParentPackage("basePackage")
@Action(value="upload", results ={
        @Result(name = "error",location = "/index.jsp"),
        @Result(name = "success",location = "/wallDemo.jsp")
})
@Namespace("/")
public class FileUploadAction extends ActionSupport implements SessionAware {
    @Autowired
    private PictureServiceI pictureService;

    private Map session;

    private File file;
    private String filename;

    public Map getSession() {
        return session;
    }

    public void setSession(Map session) {
        this.session = session;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
    /**
     * http://localhost:8080/upload!upload.action
     */
    public String upload(){
        String username=(String)session.get("username");
        if(username==null){
            return ERROR;
        }
        try {
            pictureService.save(this.file, username, this.filename, "描述");
        }catch(Exception e){
            e.printStackTrace();
            return ERROR;
        }
        return SUCCESS;
    }
}
