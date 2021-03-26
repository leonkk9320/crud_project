package com.leonkk.login_wx.service;


import com.leonkk.login_wx.entity.User;

import java.util.List;


public interface UserService {
    List<User> queryAll();
    User queryUserById(int userId);
    int insertUser(User user);
    int updateUser(User user);
    int deleteUser(int userId);
}
