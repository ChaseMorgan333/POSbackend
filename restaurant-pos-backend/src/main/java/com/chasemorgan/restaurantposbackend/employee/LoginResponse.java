package com.chasemorgan.restaurantposbackend.employee;

public class LoginResponse {

    private Long id;
    private String name;
    private EmployeeRole role;
    private boolean active;

    public LoginResponse(Long id, String name, EmployeeRole role, boolean active) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public EmployeeRole getRole() {
        return role;
    }

    public boolean isActive() {
        return active;
    }
}