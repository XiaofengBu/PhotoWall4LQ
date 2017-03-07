package com.hhu.service.impl;

import com.hhu.dao.PictureDaoI;
import com.hhu.model.Picture;
import com.hhu.service.PictureServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * Created by buxiaofeng on 17/3/7.
 */
@Service("pictureService")
public class PictureServiceImpl implements PictureServiceI {
    @Autowired
    private PictureDaoI pictureDao;
    public Serializable save(Picture picture){return pictureDao.save(picture);}
}
