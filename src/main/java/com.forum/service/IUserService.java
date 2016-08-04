package com.forum.service;

import com.forum.model.User;

/**
 * Created by Administrator on 2016/7/19.
 */
public interface IUserService {
    public User getUserById(int userId);

    public int insert(User user);
}
