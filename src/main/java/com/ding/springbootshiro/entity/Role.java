package com.ding.springbootshiro.entity;

import com.ding.springbootshiro.base.BaseEntity;

import javax.persistence.*;
import java.util.List;

/**
 * 角色
 *
 * @author DingJie on 2018/11/13
 */
@Entity
@Table(name = "sys_role")
public class Role extends BaseEntity {
    @Id
    @GeneratedValue
    private Integer id;
    private String role;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "sys_role_permission", joinColumns = {@JoinColumn(name = "rid")}, inverseJoinColumns = {
            @JoinColumn(name = "pid")})
    private List<Permission> permissions;
    @ManyToMany
    @JoinTable(name = "sys_user_role", joinColumns = {@JoinColumn(name = "rid")}, inverseJoinColumns = {
            @JoinColumn(name = "uid")})
    private List<User> users;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

}
