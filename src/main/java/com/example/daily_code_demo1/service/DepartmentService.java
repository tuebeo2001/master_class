package com.example.daily_code_demo1.service;


import com.example.daily_code_demo1.entity.DepartmentEntity;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {
    DepartmentEntity save(DepartmentEntity departmentEntity);

    List<DepartmentEntity> getAll();

    Optional<DepartmentEntity> getDetail(Long id);

    void deleteById(Long id);
}
