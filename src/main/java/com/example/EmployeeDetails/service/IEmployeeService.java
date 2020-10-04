package com.example.EmployeeDetails.service;

import com.example.EmployeeDetails.model.Employee;
import org.springframework.stereotype.Service;

@Service
public interface IEmployeeService {


    Employee getEmployeeByName(String name);
}
