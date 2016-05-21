package com.zhsy.dao;

import com.zhsy.entity.User;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

/**
 * Created by Archimedes on 2016/5/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class UserDaoTest {

    @Resource
    private UserDao userDao;

    @Test
    public void count() throws Exception {
        Map<String, Object> map = new HashMap<>();
        map.put("name like", "%c%");//..
        map.put("age > ", 32);
        int count = userDao.count(map);

        System.out.println("count: " + count);
    }

    @Test
    public void deleteByEntity() throws Exception {
        User user = userDao.findById(4);
        int result = userDao.deleteByEntity(user);
        System.out.println(result);
    }

    @Test
    public void deleteByEntitys() throws Exception {

    }

    @Test
    public void deleteById() throws Exception {

    }

    @Test
    public void deleteByIds() throws Exception {

    }

    @Test
    public void findAll() throws Exception {

    }

    @Test
    public void findById() throws Exception {

    }

    @Test
    public void findInterval() throws Exception {

    }

    @Test
    public void save() throws Exception {
        User user = new User();
        user.setName("chx");
        user.setAge(34);
        int result = userDao.save(user);
        System.out.println(result);
    }

    @Test
    public void saves() throws Exception {

    }

    @Test
    public void update() throws Exception {

    }

    @Test
    public void updates() throws Exception {

    }

}
