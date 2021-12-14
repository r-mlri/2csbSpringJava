package com.csb.SampleFullstack.controller;

import com.csb.SampleFullstack.employee.Employee;
import com.csb.SampleFullstack.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employee")
@CrossOrigin("*") //allow all connections
public class EmployeeControl {
    @Autowired
    private EmployeeRepo employeeRepository;
    @GetMapping("/employees")
    public List<Employee> getAll(){
        return employeeRepository.findAll();
    }
}