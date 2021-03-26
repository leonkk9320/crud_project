package com.leonkk.login_wx.controller;

import com.leonkk.login_wx.entity.User;
import com.leonkk.login_wx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 查询全部
     * @return
     */
    @GetMapping("/list")
    public Object list(){
        System.out.println("查询成功");
        return userService.queryAll();
    }

    /**
     * 根据id删除
     * @param id
     * @return
     */
    @GetMapping("/delete")
    public boolean delete(Integer id){
        System.out.println("删除成功");
        int i = userService.deleteUser(id);
        return i == 1;
    }

    /**
     *  根据id查询
      * @param id
     * @return
     */
    @GetMapping("/byid")
    public Object byid(Integer id){
        System.out.println("查询成功");
        return userService.queryUserById(id);
    }

    /**
     *  修改
     * @param user
     * @return
     */
    @PostMapping("/update")
    public boolean update(@RequestBody User user){
        System.out.println("修改成功");
        int i = userService.updateUser(user);
        return i == 1;
    }

    /**
     * 添加
     * @param user
     * @return
     */
    @PostMapping("/add")
    public boolean add(@RequestBody User user){
        System.out.println("添加成功");
        int i = userService.insertUser(user);
        return i == 1;
    }

}
