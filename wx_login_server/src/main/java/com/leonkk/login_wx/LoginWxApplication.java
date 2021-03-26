package com.leonkk.login_wx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.leonkk.login_wx.dao") //扫描mapper接口，否则无法运行
@SpringBootApplication
public class LoginWxApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoginWxApplication.class, args);
    }

}
