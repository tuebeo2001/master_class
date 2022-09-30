package com.example.daily_code_demo1.controller;

import com.example.daily_code_demo1.entity.DepartmentEntity;
import com.example.daily_code_demo1.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController()
@RequestMapping("/api")
public class DepartmentController {

    @Autowired
    private DepartmentService service;

    @PostMapping()
    public DepartmentEntity save(@RequestBody DepartmentEntity departmentEntity){
        return service.save(departmentEntity);
    }

    @GetMapping()
    public List<DepartmentEntity> getAll(){
        return service.getAll();
    }

    @GetMapping("/{departmentId}")
    public Optional<DepartmentEntity> getDetail(@PathVariable("departmentId")  Long id){
        return service.getDetail(id);
    }

    @DeleteMapping("/{departmentId}")
    public String deleteById(@PathVariable("departmentId") Long id){
        service.deleteById(id);
        return "Done";
    }



}
