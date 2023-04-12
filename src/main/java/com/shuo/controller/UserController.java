package com.shuo.controller;


import com.shuo.common.lang.Result;
import com.shuo.entity.User;
import com.shuo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author shuo
 * @since 2023-04-12
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/index")
    public Result index() {
        User user = userService.getById(1L);
        return Result.success(200, "操作成功", user);
    }
}
