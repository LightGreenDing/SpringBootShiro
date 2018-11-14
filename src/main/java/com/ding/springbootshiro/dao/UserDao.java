package com.ding.springbootshiro.dao;

import com.ding.springbootshiro.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author DingJie on 2018/11/13
 */
public interface UserDao extends JpaRepository<User, Integer> {

    /**
     * 通过账号获取用户
     *
     * @param username 账号
     * @return 用户
     */
    User findByUsername(String username);
}
