package com.chasemorgan.restaurantposbackend.employee;


public class CreateEmployeeRequest {

    private String name;
    private String pin;
    private EmployeeRole role;

    public CreateEmployeeRequest() {
    }

    public String getName() {
        return name;
    }

    public String getPin() {
        return pin;
    }

    public EmployeeRole getRole() {
        return role;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public void setRole(EmployeeRole role) {
        this.role = role;
    }
}