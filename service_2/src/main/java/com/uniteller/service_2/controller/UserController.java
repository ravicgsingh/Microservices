package com.uniteller.service_2.controller;

import com.uniteller.service_2.entity.Employee;
import com.uniteller.service_2.service.UserService;
import com.uniteller.service_2.valueObject.ResponseTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public Employee saveUser(@RequestBody Employee employee){
        return userService.saveUser(employee);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId){
        return userService.getUserWithDepartment(userId);
    }
}
