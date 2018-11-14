package com.ding.springbootshiro.service.impl;

import com.ding.springbootshiro.dao.UserDao;
import com.ding.springbootshiro.entity.Permission;
import com.ding.springbootshiro.entity.Role;
import com.ding.springbootshiro.entity.User;
import com.ding.springbootshiro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * 用户实现类
 *
 * @author DingJie on 2018/11/13
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;


    @Override
    public User findUserByUsername(String username) {
        return userDao.findByUsername(username);
    }

    @Override
    public Set<Role> findRoles(String username) {
        User byUsername = userDao.findByUsername(username);
        return null;
    }

    @Override
    public Set<Permission> findPermissions(String username) {
        return null;
    }
}
