package com.hhu.dao;

import com.hhu.model.Picture;

import java.io.Serializable;
import java.util.List;

/**
 * Created by buxiaofeng on 17/3/7.
 */
public interface PictureDaoI {

    Serializable save(Picture picture);
    List<Picture> queryPictureListByUserName(String username);
}
