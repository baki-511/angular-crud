package com.angular.crud.service.impl;


import com.angular.crud.entity.Employee;
import com.angular.crud.exception.EmployeeNotFoundException;
import com.angular.crud.payload.ApiResponse;
import com.angular.crud.repository.EmployeeRepository;
import com.angular.crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    
    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
    
    @Override
    public Employee getEmployee(Integer id) {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));
    }
    
    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }
    
    @Override
    public Employee updateEmployee(Employee employee) {
        Employee employee1 = getEmployee(employee.getId());
        return employeeRepository.save(employee);
    }
    
    @Override
    public ApiResponse deleteEmployee(Integer id) {
        Employee employee = getEmployee(id);
        employeeRepository.delete(employee);
        return new ApiResponse("Employee Deleted Successfully", true);
    }
}
