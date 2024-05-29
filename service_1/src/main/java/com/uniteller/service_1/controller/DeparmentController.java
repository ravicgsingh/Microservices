package com.uniteller.service_1.controller;

import com.uniteller.service_1.entity.Department;
import com.uniteller.service_1.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teams")
public class DeparmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/save")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }

    @GetMapping("{id}")
    public Department findDepartmentById(@PathVariable("id") Long id){
        return departmentService.findDepartmentById(id);
    }

}
