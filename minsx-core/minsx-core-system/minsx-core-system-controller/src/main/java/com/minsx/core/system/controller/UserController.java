package com.minsx.core.system.controller;

import com.minsx.common.util.UserUtil;
import com.minsx.core.system.service.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * IndexController
 * Created by Joker on 2017/8/29.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/currentUserName")
    public ResponseEntity<?> getCurrentUserName() {
        return new ResponseEntity<>(UserUtil.getCurrentUserName(), HttpStatus.OK);
    }

    @GetMapping(value = "/currentUserInfo")
    public ResponseEntity<?> getCurrentUserInfo() {
        return userService.getCurrentUserInfo();
    }

    @GetMapping(value = "/userInfo/{id}")
    public ResponseEntity<?> PostUserInfo(@PathVariable(required = false) Integer id) {
        return userService.getUserInfo(id);
    }


}
