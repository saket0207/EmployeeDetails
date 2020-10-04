package com.example.EmployeeDetails.rest.controller;

import com.example.EmployeeDetails.model.Employee;
import com.example.EmployeeDetails.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class EmployeeController {

    @Autowired
    IEmployeeService employeeService;

    @GetMapping("/employee/{name}")
    public Employee getEmployeeByName(@PathVariable("name") String name){
        Employee employee = employeeService.getEmployeeByName(name);

        return employee;
    }
}
