package com.hhu.service;

import com.hhu.model.User;

import java.io.Serializable;

/**
 * Created by buxiaofeng on 17/2/27.
 */
public interface UserServiceI {
    void test();
    Serializable save(User user);
}
