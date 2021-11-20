package com.csb.SampleFullstack.entity;

public class Employee {
    private int employee_id;
    private String name;
    private String location;
    private String department;
    
    public Employee(int employee_id, String name, String location, String department) {
        this.employee_id = employee_id;
        this.name = name;
        this.location = location;
        this.department = department;
    }
    
    public Employee() {
        
    }
        public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
