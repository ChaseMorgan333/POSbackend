package com.chasemorgan.restaurantposbackend.employee;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

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
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.UNAUTHORIZED,
                        "Invalid PIN"
                ));

        return new LoginResponse(
                employee.getId(),
                employee.getName(),
                employee.getRole(),
                employee.isActive()
        );
    }
}