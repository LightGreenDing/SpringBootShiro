package com.ding.springbootshiro.dao;

import com.ding.springbootshiro.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 权限
 *
 * @author DingJie on 2018/11/13
 */
public interface PermissionDao extends JpaRepository<Permission, Integer> {
}
