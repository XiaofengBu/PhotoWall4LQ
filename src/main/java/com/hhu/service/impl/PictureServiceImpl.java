package com.hhu.service.impl;

import com.hhu.dao.PictureDaoI;
import com.hhu.model.Picture;
import com.hhu.service.PictureServiceI;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Created by buxiaofeng on 17/3/7.
 */
@Service("pictureService")
public class PictureServiceImpl implements PictureServiceI {
    @Autowired
    private PictureDaoI pictureDao;

    public Serializable save(File file,String username,String picture_title,String picture_desc){
        Picture picture=new Picture();

        String root= ServletActionContext.getServletContext().getRealPath("/")+"resource/"+username;
        Random random = new Random();
        int tempInt = random.nextInt();
        Date datenew = new Date();
        SimpleDateFormat simpleDateFormatnew = new SimpleDateFormat("yyyyMMddhhmmss");
        picture_title = simpleDateFormatnew.format(datenew) + tempInt + picture_title;
        System.out.println("新的文件名称是："+picture_title);
        if(file!=null) {
            File saveFile = new File(new File(root), picture_title);
            if (!saveFile.getParentFile().exists()) {     //如果Images文件夹不存在
                saveFile.getParentFile().mkdirs();      //则创建新的多级文件夹
            }
            try {
                FileUtils.copyFile(file, saveFile);
                picture.setUsername(username);
                picture.setPicture_desc(picture_desc);
                picture.setPicture_title(picture_title);
                picture.setPicture_path(root+"/"+picture_title);
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        return pictureDao.save(picture);
    }
}
