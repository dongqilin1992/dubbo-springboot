package com.dongqilin.web;

import com.dongqilin.entity.User;
import com.dongqilin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: dongql
 * @date: 2017/10/11 17:57
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getUser/{id}")
    public User getUser(
            @PathVariable
                    Integer id) {
        User user = userService.findUserById(id);
        System.out.println(user);

        return user;
    }

    @RequestMapping("/getRedisLockDubbo")
    public String getRedisLockDubbo() {
        userService.getRedisLockDubbo();

        return "success";
    }

    @RequestMapping("/getRedisLock")
    public String getRedisLock() {
        userService.getRedisLock();

        return "success";
    }


}
