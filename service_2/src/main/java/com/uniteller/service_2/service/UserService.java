package com.uniteller.service_2.service;

import com.uniteller.service_2.entity.Employee;
import com.uniteller.service_2.repository.UserRepository;
import com.uniteller.service_2.valueObject.Department;
import com.uniteller.service_2.valueObject.ResponseTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Employee saveUser(Employee employee) {
        return userRepository.save(employee);
    }

    public ResponseTemplateVO getUserWithDepartment(Long userId) {
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Employee employee = userRepository.findById(userId).orElse(null);
        Department department = restTemplate.getForObject("http://localhost:8081/teams/" + employee.getDepartmentId(), Department.class);
        vo.setEmployee(employee);
        vo.setDepartment(department);
        return vo;
    }
}
