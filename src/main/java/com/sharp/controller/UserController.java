package com.sharp.controller;

import com.sharp.domain.User;
import com.sharp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by 584003 on 2017/2/22.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/findById/{id}")
    private User findById(@PathVariable("id") Integer id){
        return userService.findById(id);
    }

    /**
     * http://localhost:8081/spring-boot-demo/findByName/sharp123
     * @param name
     * @return
     */
    @GetMapping("/findByName/{name}")
    private List<User> findByName(@PathVariable("name") String name){
        return userService.findByName(name);
    }

    /**
     * http://localhost:8081/spring-boot-demo/findByAge/18
     * @param age
     * @return
     */
    @GetMapping("/findByAge/{age}")
    private List<User> findByAge(@PathVariable("age") Integer age){
        return userService.findByAge(age);
    }

    @PostMapping("/save")
    private String save(@RequestBody User user){
        userService.save(user);
        return "success";
    }

    @GetMapping("/delete/{id}")
    private String delete(@PathVariable("id") Integer id){
        userService.delete(id);
        return "success";
    }

    @PostMapping("/update")
    private String update(@RequestBody User user){
        userService.update(user);
        return "success";
    }

}
