package com.ding.springbootshiro.service;

import com.ding.springbootshiro.entity.Permission;
import com.ding.springbootshiro.entity.Role;
import com.ding.springbootshiro.entity.User;

import java.util.Set;

/**
 * @author DingJie on 2018/11/13
 */
public interface UserService {

    /**
     * 通过账户获取
     *
     * @param username 账户
     * @return 用户
     */
    User findUserByUsername(String username);

    /**
     * 通过账户获取所有角色
     *
     * @param username 账户
     * @return
     */
    Set<Role> findRoles(String username);

    /**
     * 通过账户获取所有权限
     *
     * @param username 账户
     * @return
     */
    Set<Permission> findPermissions(String username);
}
