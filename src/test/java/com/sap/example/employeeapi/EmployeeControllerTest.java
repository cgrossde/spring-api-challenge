package com.sap.example.employeeapi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class EmployeeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getAllEmployeesReturnsNonEmptyList() throws Exception {
        mockMvc.perform(get("/api/employee")).andDo(print()).andExpect(status().isOk()).andExpect(content().string("[{\"id\":1,\"email\":\"yidajir326@threepp.com\"},{\"id\":2,\"email\":\"vwassoumalouio@lemonjowo.buzz\"}]"));
    }

}