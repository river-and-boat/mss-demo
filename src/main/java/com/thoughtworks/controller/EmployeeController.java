package com.thoughtworks.controller;

import com.thoughtworks.entity.Employee;
import com.thoughtworks.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;
import java.util.List;

/**
 * @Author: Jiang Yuzhou
 * @DateTime: 2020/7/12 20:20
 * @Description: TODO
 */
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeMapper employeeMapper;

    @GetMapping("/emps")
    public List<Employee> getEmps(){
        List<Employee> employees = employeeMapper.selectAllEmps();
        System.out.println(employees);
        return employees;
    }

    @GetMapping("/test")
    public String test(){
        return "Hello World";
    }
}
