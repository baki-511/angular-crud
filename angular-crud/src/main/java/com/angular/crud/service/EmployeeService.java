package com.angular.crud.service;

import com.angular.crud.entity.Employee;
import com.angular.crud.payload.ApiResponse;

import java.util.List;

public interface EmployeeService {
    public Employee createEmployee(Employee employee);
    
    public Employee getEmployee(Integer id);
    
    public List<Employee> getAllEmployee();
    
    public Employee updateEmployee(Employee employee);
    
    public ApiResponse deleteEmployee(Integer id);
}
