package com.leonkk.login_wx.dao;

import com.leonkk.login_wx.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMappers {
    List<User> queryAll();
    User queryUserById(int id);
    int insertUser(User user);
    int updateUser(User user);
    int deleteUser(int id);
}
