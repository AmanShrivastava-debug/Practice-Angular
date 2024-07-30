package com.ltimindtree.ems.entity;

public class EmployeeEntity {
    private String employeeId;
    private String firstName;
    private String LastName;
    private String position;
    private double salary;
    
    public EmployeeEntity() {
    }
    public String getEmployeeId() {
        return employeeId;
    }
    public EmployeeEntity(String employeeId, String firstName, String lastName, String position, double salary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        LastName = lastName;
        this.position = position;
        this.salary = salary;
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return LastName;
    }
    public void setLastName(String lastName) {
        LastName = lastName;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

}
