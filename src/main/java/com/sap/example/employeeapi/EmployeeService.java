package com.sap.example.employeeapi;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {
    // Usually we would use a DB but to keep things simple we hardcode our employee list for now
    private static final List<Employee> employeeList = new ArrayList<Employee>() {{
        add(new Employee(UUID.fromString("46a1b70c-b273-11eb-8529-0242ac130003"), "Walter", "White", "walter@blue.diamonds"));
        add(new Employee(UUID.fromString("31f15eb6-b273-11eb-8529-0242ac130003"), "Jeffrey", "Lebowski", "der@du.de"));
        add(new Employee(UUID.fromString("4c550a14-b273-11eb-8529-0242ac130003"), "Jack", "Carr", "jack@carr.car"));
    }};

    public EmployeeService() {
    }

    public List<Employee> getAll() {
        return employeeList;
    }

    public Employee getEmployee(UUID uuid) {
        Employee employeeFound = employeeList.stream().filter(employee -> employee.getUid().equals(uuid)).findFirst().orElse(null);

        return employeeFound;
    }
}
