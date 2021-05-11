package com.sap.example.employeeapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class EmployeeController {

    @GetMapping(value = "api/dummyEmployee")
    Employee getDummyEmployees() {
        return new Employee(UUID.randomUUID(), "John", "Doe", "john.doe@doe.com");
    }

    // TODO: Add new endpoint here and use EmployeeService as a data source
}
