package com.seamless.emplyeeSystem.controller;
import com.seamless.emplyeeSystem.Employee;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.rmi.StubNotFoundException;
import java.util.*;

@RestController
@RequestMapping("/api")
public class employeeController {

    private List<Employee> employees;

    // This function will load once time
    @PostConstruct
    public void loadData(){
        employees = new ArrayList<>();
        employees.add(new Employee(0, "Sami", 23, 55000, "Java Dev", "03040460318"));
        employees.add(new Employee(1, "Ahmad", 24, 55000, "Java Dev", "03045678090"));
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employees;
    };

    // Set Path Variable
    @GetMapping("employees/{empId}")
    public Employee getEmployees(@PathVariable int empId){
        if(empId >= employees.size() || empId < 0){
            throw new EmployeeNotFoundException("Employee id not found: " + empId);
        }
        return employees.get(empId);
    }

    @ExceptionHandler
    public ResponseEntity<EmployeeErrorResponse> handleException(EmployeeNotFoundException exc){

        // Create a student error response
        EmployeeErrorResponse err = new EmployeeErrorResponse();
        err.setStatus(HttpStatus.NOT_FOUND.value());
        err.setMessage(exc.getMessage());
        err.setTimeStamp(System.currentTimeMillis());

        // return response entity
        return new ResponseEntity<>(err, HttpStatus.NOT_FOUND);
    }






}
