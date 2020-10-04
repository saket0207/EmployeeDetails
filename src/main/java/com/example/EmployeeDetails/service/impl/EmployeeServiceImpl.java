package com.example.EmployeeDetails.service.impl;

import com.example.EmployeeDetails.model.Department;
import com.example.EmployeeDetails.model.Employee;
import com.example.EmployeeDetails.service.IEmployeeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    public List<Employee> getEmployeeList(){
        Employee empSaket = new Employee();
        Department departmentSaket = new Department();
        departmentSaket.setDepartmentId("GTI");
        departmentSaket.setDepartmentName("Global Technology For India");
        empSaket.setDepartment(departmentSaket);
        empSaket.setName("Saket Kumar");
        empSaket.setDesignation("ASSOC");

        Employee empSandip = new Employee();
        Department departmentSandip = new Department();
        departmentSandip.setDepartmentId("GTI");
        departmentSandip.setDepartmentName("Global Technology For India");
        empSandip.setDepartment(departmentSandip);
        empSandip.setName("Sandip Singh");
        empSandip.setDesignation("ASSOC");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(empSaket);
        employeeList.add(empSandip);
        return employeeList;
    }

    @Override
    public Employee getEmployeeByName(String name) {

        List<Employee> employees = getEmployeeList();
        for(Employee employee : employees){
            if(employee.getName().contains(name))
                return employee;
            else
                return null;
        }

        return null;
    }
}
