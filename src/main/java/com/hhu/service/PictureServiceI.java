package com.hhu.service;

import com.hhu.model.Picture;

import java.io.File;
import java.io.Serializable;
import java.util.List;

/**
 * Created by buxiaofeng on 17/3/7.
 */
public interface PictureServiceI {
    Serializable save(File file, String username, String picture_title, String picture_desc);
    List<Picture> getPictureList(String username);

}
