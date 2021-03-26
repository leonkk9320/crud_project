package com.leonkk.login_wx.service.impl;

import com.leonkk.login_wx.entity.User;
import com.leonkk.login_wx.service.UserService;
import com.leonkk.login_wx.dao.UserMappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMappers userMappers;

    @Override
    public List<User> queryAll() {
        return userMappers.queryAll();
    }

    @Override
    public User queryUserById(int userId) {
        return userMappers.queryUserById(userId);
    }

    @Override
    public int insertUser(User user) {
        return userMappers.insertUser(user);
    }

    @Override
    public int updateUser(User user) {
        return userMappers.updateUser(user);
    }

    @Override
    public int deleteUser(int userId) {
        return userMappers.deleteUser(userId);
    }


}
