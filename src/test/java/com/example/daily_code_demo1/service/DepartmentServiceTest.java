package com.example.daily_code_demo1.service;

import com.example.daily_code_demo1.entity.DepartmentEntity;
import com.example.daily_code_demo1.repository.DepartmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DepartmentServiceTest {

    @Autowired
    DepartmentService departmentService;

    DepartmentRepository

    @BeforeEach
    void setUp() {
        DepartmentEntity entity =
                DepartmentEntity.builder()
                        .departmentName("name1")
                        .departmentAddress("ha noi")
                        .departmentCode("HE150066")
                        .departmentId(1L)
                        .build();

        Mockito.when()
    }

    @Test
    @DisplayName("Data checked")
    public void whenValidDepartmentName_thenDepartmentShouldFound() {
        String deparmentName = "IT";
        DepartmentEntity entity = departmentService.findByDepartmentName(deparmentName);

        asser

    }
}