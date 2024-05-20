package com.myProj.company.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.myProj.company.entity.Company;
import com.myProj.company.service.CompanyService;

@RestController
@RequestMapping("/api/v1/company")
public class CompanyController {
	
	@Autowired
	CompanyService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(
            @RequestBody Company school
    ) {
        service.saveCompany(school);
    }

    @GetMapping
    public ResponseEntity<List<Company>> findAllSchools() {
        return ResponseEntity.ok(service.getList());
    }

}
