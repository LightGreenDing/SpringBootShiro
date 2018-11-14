package com.ding.springbootshiro.entity;

import com.ding.springbootshiro.base.BaseEntity;


import javax.persistence.*;
import java.util.List;

/**
 * 用户
 *
 * @author DingJie on 2018/11/13
 */
@Entity
@Table(name = "sys_user")
public class User extends BaseEntity {
    @Id
    @GeneratedValue
    private long id;
    private String username;
    private String password;
    private String salt;
    private byte locked;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "sys_user_role", joinColumns = {@JoinColumn(name = "uid")}, inverseJoinColumns = {
            @JoinColumn(name = "rid")})
    private List<Role> roles;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public String getCredentialsSalt() {
        return username + salt + salt;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + "]";
    }

    public byte getLocked() {
        return locked;
    }

    public void setLocked(byte locked) {
        this.locked = locked;
    }
}
