package com.bridgelabz.EmployeePayrollApp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is required")
    private String name;

    @Min(value = 10000, message = "Salary must be at least 10,000")
    private double salary;

    @NotBlank(message = "Department is required")
    private String department;
}
