package com.bridgelabz.EmployeePayrollApp.interfaces;

import com.bridgelabz.EmployeePayrollApp.dto.EmployeeDTO;
import com.bridgelabz.EmployeePayrollApp.model.Employee;

import java.util.List;

public interface IEmployeeService {
    Employee addEmployee(EmployeeDTO employeeDTO);
    Employee getEmployeeById(Long id);
    List<Employee> getAllEmployees();
    Employee updateEmployee(Long id, EmployeeDTO employeeDTO);
    void deleteEmployee(Long id);
}
