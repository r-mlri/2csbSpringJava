package com.csb.SampleFullstack;

import com.csb.SampleFullstack.Employee;
import com.csb.SampleFullstack.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/v1/employee")
@CrossOrigin("*")

public class EmployeeControl {
    @Autowired
    private EmployeeRepo employeeRepo;

    @GetMapping("/employees")
    public List<Employee> getAll(){
        return employeeRepo.findAll();
    };


}
