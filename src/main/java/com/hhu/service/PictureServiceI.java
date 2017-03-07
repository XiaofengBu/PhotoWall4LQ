package com.hhu.service;

import com.hhu.model.Picture;

import java.io.Serializable;

/**
 * Created by buxiaofeng on 17/3/7.
 */
public interface PictureServiceI {
    Serializable save(Picture picture);
}
