package com.zhsy.dao;

import com.zhsy.entity.User;

import java.util.List;

/**
 * Created by Archimedes on 2016/5/15.
 */
public interface UserDao extends CommonDao<User> {

    int saves(List<User> userList);

    int updates(List<User> userList);
}
