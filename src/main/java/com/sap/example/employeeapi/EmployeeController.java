package com.sap.example.employeeapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @GetMapping(value = "api/employee")
    ResponseEntity<List<Employee>> getAllEmployees() {
        return ResponseEntity.ok(null);
    }

}
