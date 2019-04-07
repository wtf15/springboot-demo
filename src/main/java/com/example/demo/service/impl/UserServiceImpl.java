package com.example.demo.service.impl;

import com.example.demo.bean.User;
import com.example.demo.dao.UserDao;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wtf
 * @date 2019/4/7 19:09
 * @description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User findUserName(String userName) {
        return userDao.findByUserName(userName);
    }
}
