package com.sap.example.employeeapi;

import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.modelmapper.config.Configuration;
import org.modelmapper.spi.MappingContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmployeeApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeApiApplication.class, args);
    }

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration()
                .setFieldAccessLevel(Configuration.AccessLevel.PRIVATE);
        modelMapper.typeMap(Employee.class, EmployeeEmailDTO.class).addMapping(Employee::getUid, EmployeeEmailDTO::setId);
        modelMapper.typeMap(Employee.class, EmployeeEmailDTO.class).addMapping(Employee::getEmail, EmployeeEmailDTO::setEmail);

        return modelMapper;
    }
}

