package com.zhsy.dao;

import com.sun.org.apache.xpath.internal.SourceTree;
import com.zhsy.entity.User;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.annotation.Resource;

/**
 * Created by Archimedes on 2016/5/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class UserDaoTest {

    @Resource
    private UserDao userDao;

    @Test
    public void save() throws Exception {
        User user = new User();
        user.setName("chx");
        user.setAge(34);
        int result = userDao.save(user);
        System.out.println(result);
    }

    @Test
    public void saves() {
        List<User> users = new ArrayList<>();
        User user;
        for (int i = 1; i < 5; i++) {
            user = new User();
            user.setName("name" + i);
            user.setAge(new Random().nextInt(100));
            users.add(user);
        }

        int result = userDao.saves(users);
        System.out.println(result);
    }

    // TODO: 2016/5/17
    @Test
    public void update() throws Exception {
        User user = userDao.findById(3);
        user.setAge(1111);
        user.setName("xyzZ");
        int result = userDao.update(user);
        System.out.println(result);
    }

    //TODO
    @Test
    public void updates() throws Exception {
        List<User> userList = new ArrayList<>();
        userDao.updates(userList);
    }

    @Test
    public void deleteById() throws Exception {
        int result = userDao.deleteById(4);
        System.out.println(result);
        User user = userDao.findById(4);
        System.out.println(user);
    }

    @Test
    public void deleteByIds() throws Exception {
        int[] ids = {7, 9, 11};
        int result = userDao.deleteByIds(ids);
        System.out.println(result);
    }

    @Test
    public void findById() throws Exception {
        User user = userDao.findById(1);
        System.out.println(user);
    }

    @Test
    public void findAll() throws Exception {
        List<User> userList = userDao.findAll();
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void findInterval() throws Exception {
        List<User> userList = userDao.findInterval(0, 3);
        userList.forEach(user -> System.out.println(user));
    }

    //TODO: 2016/5/17
    @Test
    public void count() throws Exception {
        Map<String, Object> map = new HashMap<>();
        map.put("age = ", "32");
        int count = userDao.count(map);
        System.out.println("count: " + count);
    }

    @Test
    public void test() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.forEach(i -> System.out.println(i));
    }
}
