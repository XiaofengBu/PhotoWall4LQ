package com.hhu.test;

import com.hhu.service.UserServiceI;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by buxiaofeng on 17/2/27.
 */
public class TestSpring {

    @Test
    public void test(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:spring.xml");
        UserServiceI userServiceI =(UserServiceI) ac.getBean("userService");
    }
}
