package com.chasemorgan.restaurantposbackend.employee;

import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/admin/employees")
public class AdminEmployeeController {

    private final EmployeeRepository employeeRepository;

    public AdminEmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @PostMapping
    public Employee createEmployee(@RequestBody CreateEmployeeRequest request) {
        Employee employee = new Employee();

        employee.setName(request.getName());
        employee.setPin(request.getPin());
        employee.setRole(request.getRole());
        employee.setActive(true);

        return employeeRepository.save(employee);
    }
}