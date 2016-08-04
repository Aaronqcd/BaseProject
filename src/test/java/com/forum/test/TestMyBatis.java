package com.forum.test;

import com.alibaba.fastjson.JSON;
import com.forum.model.User;
import com.forum.service.IUserService;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/7/19.
 */
public class TestMyBatis {
    private static Logger logger = Logger.getLogger(TestMyBatis.class);
    private ApplicationContext ac = null;
    @Autowired
    private IUserService userService;

    @Before
    public void before() {
        ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        userService = (IUserService) ac.getBean("userService");
    }
    //private User user = new User();

    @Test
    public void test() {
        User user = new User();
        user.setUsername("王建华");
        user.setJob("Java开发工程师");
        int res = userService.insert(user);
        logger.info("res："+res);
        /*User user = userService.getUserById(1);
        logger.info("名称："+user.getUsername());
        logger.info(JSON.toJSONString(user));*/
    }
}
