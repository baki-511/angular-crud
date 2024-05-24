package com.angular.crud.exception;

public class EmployeeNotFoundException extends RuntimeException{
    public EmployeeNotFoundException(String message){
        super(message);
    }
    public EmployeeNotFoundException(Integer id){
        super("Employee NOT Found with ID : " + id);
    }
    
    public EmployeeNotFoundException(String message, Integer id){
        super(message);
    }
}
