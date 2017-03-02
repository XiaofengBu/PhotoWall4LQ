package com.hhu.service;

import com.hhu.model.User;

import java.io.Serializable;

/**
 * Created by buxiaofeng on 17/2/27.
 */
public interface UserServiceI {

    Serializable save(User user);
    void register(String username,String chn_Name,String password);
    boolean isLogin(String username,String password);
}
