package com.sap.example.employeeapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
public class EmployeeController {
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    EmployeeService employeeService;

    @GetMapping(value = "api/dummyEmployee")
    Employee getDummyEmployees() {
        return new Employee(UUID.randomUUID(), "John", "Doe", "john.doe@doe.com");
    }

    // TODO: Add new endpoint here and use EmployeeService as a data source

    @GetMapping(value = "api/employee/emaillist")
    List<EmployeeEmailDTO> getAllEmployees() {
        List<Employee> listEmployees = employeeService.getAll();

        return listEmployees
                .stream()
                .map(employee -> modelMapper.map(employee, EmployeeEmailDTO.class)).collect(Collectors.toList());
    }

    @RequestMapping(value = "api/employee")
    EmployeeEmailDTO getEmployee(@RequestParam("id") String id){
        Employee employee = employeeService.getEmployee(UUID.fromString(id));

        return modelMapper.map(employee, EmployeeEmailDTO.class);
    }
}
