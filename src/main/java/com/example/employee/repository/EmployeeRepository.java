package com.example.employee.repository;
import java.util.*;
import com.example.employee.model.*;

public interface EmployeeRepository{
    ArrayList<Employee> getEmployee();
    Employee getEmployeeById(int employeeId);
    Employee addEmployee(Employee employee);
    Employee updateEmployee(Employee employee, int employeeId);
    void deleteEmployee(int employeeId);
}