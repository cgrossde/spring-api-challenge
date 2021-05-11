package com.sap.example.employeeapi;

import java.util.UUID;

public class Employee {

    private final UUID uid;

    private final String firstName;

    private final String lastName;

    private final String email;

    public Employee(UUID uid, String firstName, String lastName, String email) {
        this.uid = uid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public UUID getUid() {
        return uid;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
