package com.iqmsoft.controller;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iqmsoft.service.UserService;


@RestController
@RequestMapping("/user")
public class UserController {

  @Resource
  private UserService userService;

  @RequestMapping("/task")
  public String userTask() {
    userService.task1();
    userService.task2();
    userService.task3();
    return "Task is required.";
  }

}
