package com.javabycode.springboot.bean;


import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;


public class Status {


	private Integer id;
	

	private String name;
	
	
	
	public Status() {
		super();
	}

	public Status(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Status(Integer id) {
	
		this.id = id;

	}

	@NotNull
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@NotBlank
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Status [id=" + id + ", name=" + name + "]";
	}
	
	
}
