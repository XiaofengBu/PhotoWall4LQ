package com.hhu.service.impl;

import com.hhu.dao.UserDaoI;
import com.hhu.model.User;
import com.hhu.service.UserServiceI;
import org.apache.commons.codec.digest.DigestUtils;
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

    public Serializable save(User user){
        return userDao.save(user);
    }
    public void register(String username,String chn_Name,String password){
        User user=new User();
        user.setUsername(username);
        user.setChn_Name(chn_Name);
        user.setPassword(DigestUtils.md5Hex(password));
        userDao.save(user);
    }
    public boolean isLogin(String username,String password){
        User user=userDao.findByUsername(username);
        if(user!=null) {
            return (DigestUtils.md5Hex(password).equals(user.getPassword()));

        }else{
            return false;
        }
    }
    public String getCHN_Name(String username){
        User user=userDao.findByUsername(username);
        return user.getChn_Name();
    }
}
