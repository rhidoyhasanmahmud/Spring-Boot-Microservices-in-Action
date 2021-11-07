package com.codemechanix.user.controller;

import com.codemechanix.user.entity.User;
import com.codemechanix.user.service.UserService;
import com.codemechanix.user.vo.ResponseTemplateVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user) {
        log.info("Inside saveUser method of UserController");
        return userService.saveUser(user);
    }

    @GetMapping("/getByUserId/{userId}")
    public ResponseTemplateVo findUserWithDepartmentByUserId(@PathVariable Long userId) {
        log.info("Inside findUserWithDepartmentById method of UserController");
        return userService.findUserWithDepartmentByUserId(userId);
    }

}
