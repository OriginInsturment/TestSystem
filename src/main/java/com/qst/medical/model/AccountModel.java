package com.qst.medical.model;

import com.qst.medical.domain.Account;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class AccountModel extends Account implements UserDetails {
    private String urealName; //用户真实姓名
    private Collection<? extends GrantedAuthority> authorities; //认证集


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return this.getPwd();
    }

    @Override
    public String getUsername() {
        return this.getUname();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public String getUrealName() {
        return urealName;
    }

    public void setUrealName(String urealName) {
        this.urealName = urealName;
    }

    public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
        this.authorities = authorities;
    }

    public AccountModel(Long id, String urealName, String realname, String role, String pwd, Collection<? extends GrantedAuthority> authorities) {
        super(id,urealName,role,pwd);
        setRealname(realname);
        this.urealName=realname;
        this.authorities = authorities;
    }

    public AccountModel() {
    }

}