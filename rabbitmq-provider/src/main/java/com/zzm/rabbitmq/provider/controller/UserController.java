package com.zzm.rabbitmq.provider.controller;

import com.zzm.rabbitmq.provider.bean.UserEntity;
import com.zzm.rabbitmq.provider.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: UserController
 * @Description: 用户控制层
 * @Author: 邹智敏
 * @Date: 2018/8/9   11:03
 * @Version: 1.0
 */
@Controller
@RequestMapping("/user")
public class UserController {
    /**
     * 用户业务逻辑
     */
    @Autowired
    private UserService userService;

    /**
     * 保存用户基本信息
     * @param userEntity
     * @return
     */
    @RequestMapping(value = "/save")
    public UserEntity save(UserEntity userEntity) throws Exception
    {
        userService.save(userEntity);
        return userEntity;
    }
}
