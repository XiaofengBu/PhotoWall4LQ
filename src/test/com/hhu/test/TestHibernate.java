package com.hhu.test;

import com.hhu.model.User;
import com.hhu.service.UserServiceI;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by buxiaofeng on 17/2/28.
 */
public class TestHibernate {
    private UserServiceI userService;
    @Test
    public void testSave(){
        ApplicationContext ac=new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-hibernate.xml"});
        userService=(UserServiceI) ac.getBean("userService");
        User user=new User();
        user.setUsername("test");
        user.setChn_Name("test");
        user.setPassword("test");
        userService.save(user);
    }
}
