package com.chasemorgan.restaurantposbackend.employee;


import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String pin;

    @Enumerated(EnumType.STRING)
    private EmployeeRole role;

    private boolean active = true;

    public Employee() {
    }

    public Employee(String name, String pin, EmployeeRole role) {
        this.name = name;
        this.pin = pin;
        this.role = role;
    }

    public Long getId() {
        return id;
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

    public boolean isActive() {
        return active;
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

    public void setActive(boolean active) {
        this.active = active;
    }
}