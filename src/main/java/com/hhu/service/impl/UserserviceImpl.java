package com.hhu.service.impl;

import com.hhu.dao.UserDaoI;
import com.hhu.model.User;
import com.hhu.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * Created by buxiaofeng on 17/2/27.
 */
@Service("userService")
public class UserserviceImpl implements UserServiceI {

    @Autowired
    private UserDaoI userDao;

    public void test(){
        System.out.println("Hello Spring!");
    }

    public Serializable save(User user){
        return userDao.save(user);
    }

}
