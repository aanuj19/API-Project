package com.myprojectaanuj.demo.dto;

import com.myprojectaanuj.demo.annotations.EmployeeRoleValidation;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {

    private Long id;

    @NotBlank(message = "Name of the employee cannot be blank/null")
    @Size(min = 3, max = 20, message = "Number of characters in name must be between 3 and 20")
    private String name;

    @NotBlank(message = "Email of the employee cannot be blank/null")
    @Email(message = "Provided email is not valid")
    private String email;

    @NotNull(message = "Age of the employee cannot be blank/null")
    @Max(value = 80, message = "Age of Employee cannot be greater than 80")
    @Min(value = 18, message = "Age of Employee cannot be less than 18")
    private Integer age;

    @NotBlank(message = "Role of the employee cannot be blank/null")
//    @Pattern(regexp = "^(USER|ADMIN)$", message= "Role of employee can either be ADMIN or USER")
    @EmployeeRoleValidation
    private String role;

    @NotNull(message = "Salary of the employee cannot be blank/null")
    @Positive(message = "Salary of Employee shpuld be positive")
    private Integer salary;

    @PastOrPresent(message = "Date of joining must be past/present date")
    private LocalDate dateOfJoining;

    @AssertTrue(message = "Employee should be active")
    private Boolean isActive;
}
