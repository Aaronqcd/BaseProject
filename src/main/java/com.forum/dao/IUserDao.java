package com.forum.dao;

import com.forum.model.User;

/**
 * Created by Administrator on 2016/7/19.
 */
public interface IUserDao {
    public User selectById(int id);
}
