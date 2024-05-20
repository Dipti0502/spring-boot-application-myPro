package com.myProj.company.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.myProj.company.constants.EntityConstants;



@Entity
@Table(name = EntityConstants.MIC_TABLE_COMPANY)
public class Company {

	@Id
	@Column(name = EntityConstants.BDN_COL_ID)
    private Integer id;
	
	
	@Column(name = EntityConstants.BDN_COL_NAME)
    private String name;
	
	@Column(name = EntityConstants.BDN_COL_EMAIL)
    private String email;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Company(Integer id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	public Company() {}
	   
}
