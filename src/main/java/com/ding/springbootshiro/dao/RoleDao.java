package com.ding.springbootshiro.dao;

import com.ding.springbootshiro.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 角色
 *
 * @author DingJie on 2018/11/13
 */
public interface RoleDao  extends JpaRepository<Role, Integer> {
}
