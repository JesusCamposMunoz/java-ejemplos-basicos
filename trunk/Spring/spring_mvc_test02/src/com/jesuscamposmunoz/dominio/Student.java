package com.jesuscamposmunoz.dominio;

import java.util.Date;

public class Student {
	
	private Integer age;
	private String name;
	private Integer id;
	private Date birthDate;
		
	public void setAge(Integer age) {
	this.age = age;
	}
	public Integer getAge() {
	return age;
	}
		
	public void setName(String name) {
	this.name = name;
	}
	public String getName() {
	return name;
	}
		
	public void setId(Integer id) {
	this.id = id;
	}
	public Integer getId() {
	return id;
	}
	
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
   
   
//   private String identidad;
//   public void setIdentidad(String identidad) {
//      this.identidad = identidad;
//   }
//   public String getIdentidad() {
//      return identidad;
//   }
}
