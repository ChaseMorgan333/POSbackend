package com.chasemorgan.restaurantposbackend.employee;

public class LoginRequest {

    private String pin;

    public LoginRequest() {
    }

    public LoginRequest(String pin) {
        this.pin = pin;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
}