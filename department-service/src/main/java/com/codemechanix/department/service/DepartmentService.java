package com.codemechanix.department.service;

import com.codemechanix.department.entity.Department;
import com.codemechanix.department.repo.DepartmentRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepo departmentRepo;

    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment method of DepartmentService");
        return departmentRepo.save(department);
    }

    public Optional<Department> findDepartmentId(Long departmentId) {
        log.info("Inside findDepartmentId method of DepartmentService");
        return departmentRepo.findById(departmentId);
    }
}
