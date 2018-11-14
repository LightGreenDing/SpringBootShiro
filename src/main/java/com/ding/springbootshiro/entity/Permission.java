package com.ding.springbootshiro.entity;

import com.ding.springbootshiro.base.BaseEntity;

import javax.persistence.*;
import java.util.List;

/**
 * 权限
 *
 * @author DingJie on 2018/11/13
 */
@Entity
@Table(name = "sys_permission")
public class Permission extends BaseEntity {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    @ManyToMany
    @JoinTable(name = "sys_role_permission", joinColumns = {@JoinColumn(name = "pid")}, inverseJoinColumns = {
            @JoinColumn(name = "rid")})
    private List<Role> roles;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
