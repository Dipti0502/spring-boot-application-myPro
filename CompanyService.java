package com.myProj.company.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myProj.company.entity.Company;
import com.myProj.company.repository.CompanyRepository;

import lombok.RequiredArgsConstructor;

@Service
public class CompanyService {
	
	@Autowired
	CompanyRepository companyRepo;
	public CompanyService() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void saveCompany(Company companyReq) {
//		School school = new School();
//		CommonHelper.updateEntityProperties(schoolReq, school);
		companyRepo.save(companyReq);
	}
	
	public List<Company> getList(){
		return companyRepo.findAll();
	}
}
