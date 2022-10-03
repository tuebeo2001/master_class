package com.example.daily_code_demo1.service;

import com.example.daily_code_demo1.entity.DepartmentEntity;
import com.example.daily_code_demo1.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public DepartmentEntity save(DepartmentEntity departmentEntity) {
        return departmentRepository.save(departmentEntity);
    }

    @Override
    public List<DepartmentEntity> getAll() {
        return departmentRepository.findAll();
    }

    @Override
    public Optional<DepartmentEntity> getDetail(Long id) {
        return departmentRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        departmentRepository.deleteById(id);
    }

    @Override
    public List<DepartmentEntity> findByDepartmentName(String departmentName) {
       return departmentRepository.findByDepartmentName(departmentName);
    }
}
