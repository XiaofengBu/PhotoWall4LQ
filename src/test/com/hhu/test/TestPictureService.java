package com.hhu.test;

import com.hhu.model.Picture;
import com.hhu.service.PictureServiceI;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by buxiaofeng on 17/3/7.
 */
public class TestPictureService {
    private PictureServiceI pictureService;
    @Test
    public void testSave(){
        ApplicationContext ac=new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-hibernate.xml"});
        pictureService=(PictureServiceI) ac.getBean("pictureService");
        Picture picture=new Picture();
        picture.setPicture_title("标题");
        picture.setPicture_desc("描述");
        picture.setPicture_path("路径");
        picture.setUsername("test");
        pictureService.save(picture);
    }
}
