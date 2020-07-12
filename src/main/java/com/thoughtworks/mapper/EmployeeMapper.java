package com.thoughtworks.mapper;

import com.thoughtworks.entity.Employee;

import java.util.List;

/**
 * @Author: Jiang Yuzhou
 * @DateTime: 2020/7/12 20:18
 * @Description: TODO
 */
public interface EmployeeMapper {

    List<Employee> selectAllEmps();
}
