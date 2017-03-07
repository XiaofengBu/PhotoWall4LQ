package com.hhu.dao.impl;

import com.hhu.dao.PictureDaoI;
import com.hhu.model.Picture;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * Created by buxiaofeng on 17/3/7.
 */
@Repository("pictureDao")
public class PictureDaoImpl implements PictureDaoI{
    @Autowired
    private SessionFactory sessionFactory;
    public Serializable save(Picture picture){return sessionFactory.getCurrentSession().save(picture);}
}
