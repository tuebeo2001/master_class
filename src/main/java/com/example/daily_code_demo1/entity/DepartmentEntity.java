package com.example.daily_code_demo1.entity;

import jdk.jfr.Name;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Data
@NoArgsConstructor
@Entity
public class DepartmentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Name("department_Id")
    private Long departmentId;

    @NotBlank(message = "Please Add Department Name" )
    private String departmentName;

    @NotNull
    private String departmentAddress;

    private String departmentCode;
}
