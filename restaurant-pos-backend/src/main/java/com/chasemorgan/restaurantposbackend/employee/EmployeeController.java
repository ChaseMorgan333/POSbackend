package com.chasemorgan.restaurantposbackend.employee;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest request) {
        Employee employee = employeeRepository.findByPinAndActiveTrue(request.getPin())
                .orElseThrow(() -> new RuntimeException("Invalid PIN"));

        return new LoginResponse(
                employee.getId(),
                employee.getName(),
                employee.getRole(),
                employee.isActive()
        );
    }
}