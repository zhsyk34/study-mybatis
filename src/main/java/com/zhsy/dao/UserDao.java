package com.zhsy.dao;

import com.zhsy.entity.User;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Archimedes on 2016/5/15.
 */
public interface UserDao {

    int save(User user);

    int update(User user);

    int delete(int id);

    User find(int id);

    List<User> findAll();

    List<User> findByPage(@Param("offset") int offset, @Param("limit") int limit);
}
