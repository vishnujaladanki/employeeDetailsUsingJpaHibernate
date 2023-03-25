package com.example.employee.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

import com.example.employee.model.Employee;
import com.example.employee.service.EmployeeJpaService;


@RestController
public class EmployeeController{
@Autowired
public EmployeeJpaService employeeJpaServices;
@GetMapping("/employees")
public ArrayList<Employee> getEmployee(){
    return employeeJpaServices.getEmployee();
}
@GetMapping("/employees/{employeeId}")
public Employee getEmployeeById( @PathVariable("employeeId") int employeeId){
    return employeeJpaServices.getEmployeeById(employeeId);
}
@PostMapping("/employees")
public Employee addEmployee(@RequestBody Employee employee){
    return employeeJpaServices.addEmployee(employee);
}
@PutMapping("/employees/{employeeId}")
public Employee updateEmployee(@RequestBody Employee employee,@PathVariable("employeeId") int employeeId){
    return employeeJpaServices.updateEmployee(employee, employeeId);
}
@DeleteMapping("/employees/{employeeId}")
public void deleteEmployee(@PathVariable("employeeId") int employeeId){
    employeeJpaServices.deleteEmployee(employeeId);
} 
}
