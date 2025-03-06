package com.bridgelabz.EmployeePayrollApp.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {
    @NotBlank(message = "Name is required")
    private String name;

    @Min(value = 10000, message = "Salary must be at least 10,000")
    private double salary;

    @NotBlank(message = "Department is required")
    private String department;
}


