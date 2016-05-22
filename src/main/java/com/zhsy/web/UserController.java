package com.zhsy.web;

import com.zhsy.entity.User;
import com.zhsy.service.UserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import javax.annotation.Resource;

/**
 * Created by Archimedes on 2016/5/22.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private UserService userService;

    @RequestMapping(name = "/list")
    public String list(Model model) {
        System.out.println("use spring mvc");
        List<User> users = userService.findAll();
        model.addAttribute("list", users);
        return "list";
    }
}
