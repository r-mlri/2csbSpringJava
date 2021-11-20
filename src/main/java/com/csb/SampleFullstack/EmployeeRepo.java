package com.csb.SampleFullstack;
import com.csb.SampleFullstack.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface EmployeeRepo extends JpaRepository<Employee, Long>{

}
