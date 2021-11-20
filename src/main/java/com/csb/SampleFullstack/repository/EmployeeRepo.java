package com.csb.SampleFullstack.repository;
import com.csb.SampleFullstack.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface EmployeeRepo extends JpaRepository<Employee, Long>{

}
