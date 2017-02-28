package com.hhu.dao.impl;

import com.hhu.dao.UserDaoI;
import com.hhu.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * Created by buxiaofeng on 17/2/28.
 */

@Repository("userDao")
public class UserDaoImpl implements UserDaoI{


    @Autowired
    private SessionFactory sessionFactory;

    public Serializable save(User user){
        return sessionFactory.getCurrentSession().save(user);
    }
}
