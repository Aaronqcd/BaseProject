package com.forum.service.impl;

import com.forum.dao.IUserDao;
import com.forum.dao.UserMapper;
import com.forum.model.User;
import com.forum.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/7/19.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper mapper;

    public User getUserById(int userId) {

        return mapper.selectByPrimaryKey(userId);
    }

    public int insert(User user) {
        return mapper.insert(user);
    }
}
