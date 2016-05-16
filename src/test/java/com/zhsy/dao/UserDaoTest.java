package com.zhsy.dao;

import com.zhsy.entity.User;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

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
        int count = userDao.save(user);
        System.out.println(count);
    }

    @Test
    public void update() throws Exception {
        User user = userDao.find(3);
        user.setAge(1111);
        user.setName("xyzZ");
        int change = userDao.update(user);
        System.out.println(change);
    }

    @Test
    public void delete() throws Exception {
        int change = userDao.delete(4);
        System.out.println(change);
        User user = userDao.find(4);
        System.out.println(user);
    }

    @Test
    public void find() throws Exception {
        User user = userDao.find(1);
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
    public void findByPage() throws Exception {
        List<User> userList = userDao.findByPage(0, 3);
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
