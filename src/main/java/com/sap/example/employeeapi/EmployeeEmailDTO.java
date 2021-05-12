package com.sap.example.employeeapi;

import java.util.UUID;

public class EmployeeEmailDTO {
    private UUID id;

    private String email;

    public EmployeeEmailDTO() {
        this.id = null;
        this.email = email;
    }

    public EmployeeEmailDTO(UUID id, String email) {
        this.id = id;
        this.email = email;
    }

    public UUID getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}