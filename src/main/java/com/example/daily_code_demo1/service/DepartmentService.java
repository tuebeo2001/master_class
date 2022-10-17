package com.example.daily_code_demo1.service;


import com.example.daily_code_demo1.entity.DepartmentEntity;
import com.example.daily_code_demo1.error.DepartmentNotFoundException;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {
    DepartmentEntity save(DepartmentEntity departmentEntity);

    List<DepartmentEntity> getAll();

    DepartmentEntity getDetail(Long id) throws DepartmentNotFoundException;

    void deleteById(Long id);

    DepartmentEntity findByDepartmentName(String departmentName);

    DepartmentEntity updateDepartment(Long departmentId, DepartmentEntity department);
}
