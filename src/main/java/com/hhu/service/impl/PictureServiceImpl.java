package com.hhu.service.impl;

import com.hhu.dao.PictureDaoI;
import com.hhu.model.Picture;
import com.hhu.service.PictureServiceI;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.Serializable;

/**
 * Created by buxiaofeng on 17/3/7.
 */
@Service("pictureService")
public class PictureServiceImpl implements PictureServiceI {
    @Autowired
    private PictureDaoI pictureDao;

    public Serializable save(File file,String username,String picture_title,String picture_desc){
        Picture picture=new Picture();
        picture.setUsername(username);
        picture.setPicture_desc(picture_desc);
        picture.setPicture_title(picture_title);
        String root= ServletActionContext.getServletContext().getRealPath("/");
        String filepath="resource/"+username+"/"+picture_title;
        file.renameTo(new File(root,filepath));
        picture.setPicture_path(filepath);
        return pictureDao.save(picture);
    }
}
