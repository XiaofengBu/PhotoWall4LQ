package com.hhu.action;

import com.hhu.model.Picture;
import com.hhu.service.PictureServiceI;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.*;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by buxiaofeng on 17/3/14.
 */
@ParentPackage("json-default")
@Results({
        @Result(name = ActionSupport.SUCCESS, type = "json"),
        @Result(name = ActionSupport.ERROR, type = "json") })
@Namespace("/")
public class GetPictureWallListAction extends ActionSupport implements SessionAware{
    @Autowired
    private PictureServiceI pictureService;

    private Map session;
    private List<Picture> pictureList;
    private static final int listNumber=10;

    public Map getSession() {
        return session;
    }

    public void setSession(Map session) {
        this.session = session;
    }

    public List<Picture> getPictureList() {
        return pictureList;
    }

    public void setPictureList(List<Picture> pictureList) {
        this.pictureList = pictureList;
    }

    /**
     * http://localhost:8080/getWallList.action
     * @return
     */
    @Action(value="getWallList", results={@Result(type="json", params={"pictureList","pictureList"})})
    public String getWallList(){
        String username=(String)session.get("username");
        if(username==null){
            return ERROR;
        }
        if(username!=null){
            List<Picture> allPicture=pictureService.getPictureList(username);
            pictureList=new ArrayList<Picture>();
            if (allPicture.size()>10) {
                for (int i = 1; i <= listNumber; i++) {
                    pictureList.add(allPicture.get(allPicture.size()-i));
                }
            }else{
                pictureList=allPicture;
            }
        }
        return SUCCESS;
    }

}
