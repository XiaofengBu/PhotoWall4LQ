package com.hhu.dao;

import com.hhu.model.Picture;

import java.io.Serializable;

/**
 * Created by buxiaofeng on 17/3/7.
 */
public interface PictureDaoI {

    Serializable save(Picture picture);
}
