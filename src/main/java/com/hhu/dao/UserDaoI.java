package com.hhu.dao;


import com.hhu.model.User;

import java.io.Serializable;

/**
 * Created by buxiaofeng on 17/2/28.
 */
public interface UserDaoI {

    Serializable save(User user);
    User findByUsername(String username);
}
