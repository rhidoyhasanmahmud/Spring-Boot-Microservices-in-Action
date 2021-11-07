package com.codemechanix.department.controller;

import com.codemechanix.department.entity.Department;
import com.codemechanix.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {
        log.info("Inside saveDepartment method of DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/getById/{departmentId}")
    public Optional<Department> findDepartmentId(@PathVariable Long departmentId) {
        log.info("Inside findDepartmentId method of DepartmentController");
        return departmentService.findDepartmentId(departmentId);
    }
}
