package com.seamless.emplyeeSystem;

public class Employee {
    public int empId;
    public String empName;
    public int empAge;
    public int empSalary;
    public String empRole;
    public String phoneNo;

    public Employee(int empId, String empName, int empAge, int empSalary, String empRole, String phoneNo){
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
        this.empSalary = empSalary;
        this.empRole = empRole;
        this.phoneNo = phoneNo;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public int getSalary() {
        return empSalary;
    }

    public void setSalary(int salary) {
        empSalary = salary;
    }

    public String getEmpRole() {
        return empRole;
    }

    public void setEmpRole(String empRole) {
        this.empRole = empRole;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}
