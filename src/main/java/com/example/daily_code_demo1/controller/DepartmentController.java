package com.example.daily_code_demo1.controller;

import com.example.daily_code_demo1.entity.DepartmentEntity;
import com.example.daily_code_demo1.error.DepartmentNotFoundException;
import com.example.daily_code_demo1.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;


@RestController()
@RequestMapping("/api")
public class DepartmentController {

    @Autowired
    private DepartmentService service;

    @PostMapping()
    public DepartmentEntity save(@Valid @RequestBody DepartmentEntity departmentEntity) {
        return service.save(departmentEntity);
    }

    @GetMapping()
    public List<DepartmentEntity> getAll() {
        return service.getAll();
    }

    @GetMapping("/{departmentId}")
    public DepartmentEntity getDetail(@PathVariable("departmentId") Long id) throws DepartmentNotFoundException {
        return service.getDetail(id);
    }

    @DeleteMapping("/{departmentId}")
    public String deleteById(@PathVariable("departmentId") Long id) {
        service.deleteById(id);
        return "Delete successfully";
    }

    @GetMapping("/department/name/{name}")
    public DepartmentEntity getByName(@PathVariable("name") String departmentName) {
        return service.findByDepartmentName(departmentName);
    }

    @PutMapping("/{id}")
    public DepartmentEntity updateDepartment(@PathVariable("id") Long departmentId, @RequestBody DepartmentEntity department) {
        return service.updateDepartment(departmentId, department);
    }
}
