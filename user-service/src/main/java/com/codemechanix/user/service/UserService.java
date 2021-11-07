package com.codemechanix.user.service;

import com.codemechanix.user.entity.User;
import com.codemechanix.user.repo.UserRepo;
import com.codemechanix.user.vo.Department;
import com.codemechanix.user.vo.ResponseTemplateVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private RestTemplate restTemplate;

    @Value("${app.department.url}")
    private String departmentServiceURL;


    public User saveUser(User user) {
        log.info("Inside saveUser method of UserController");
        return userRepo.save(user);
    }

    public ResponseTemplateVo findUserWithDepartmentByUserId(Long userId) {
        log.info("Inside findUserById method of UserService");
        ResponseTemplateVo responseTemplateVo = new ResponseTemplateVo();

        User user = userRepo.findByUserId(userId);
        Department department = restTemplate.getForObject(departmentServiceURL + "/getById/" + user.getDepartmentId(), Department.class);

        responseTemplateVo.setUser(user);
        responseTemplateVo.setDepartment(department);

        return responseTemplateVo;
    }
}
