package com.example.daily_code_demo1.repository;

import com.example.daily_code_demo1.entity.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Long> {
    public List<DepartmentEntity> findByDepartmentNameIgnoreCase(String departmentName);


}
