package com.farm.FarmApplication.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity


public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long empId;
	private String name;
	private Integer age;
	@Column(name = "PHONE_NUMBER")
	private Long phoneNumber=(long) (Math.random()*Math.pow(10, 10));
	private String designation;
	private Double selary = Math.random()*100000;
	
	public Employee() {
		super();
	}

	public Employee(Long empId, String name, Integer age, Long phoneNumber, String designation, Double selary) {
		super();
		this.empId = empId;
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.designation = designation;
		this.selary = selary;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Double getSelary() {
		return selary;
	}

	public void setSelary(Double selary) {
		this.selary = selary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", age=" + age + ", phoneNumber=" + phoneNumber
				+ ", designation=" + designation + ", selary=" + selary + "]";
	}

	
	
}
