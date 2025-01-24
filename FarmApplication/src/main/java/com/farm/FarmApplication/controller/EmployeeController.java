package com.farm.FarmApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.farm.FarmApplication.entity.Employee;
import com.farm.FarmApplication.service.EmpoyeeService;

@RestController

public class EmployeeController {

	@Autowired
	EmpoyeeService employeeService;
	
	@PostMapping("/saveEmployees")
	public List<Employee> saveEmpoyees(@RequestBody List <Employee> employeeList){
		return employeeService.saveEmployeeData(employeeList);
		
	}
	
	@GetMapping("/getEmployee")
	public List<Employee> getEmployees(){
		return employeeService.getEmployees();
	}
	
	@GetMapping("/getEmployeeById/{empId}")
	public Employee getEmployees(@PathVariable Long empId){
		return employeeService.getEmployeeById(empId);
	}
	
	@DeleteMapping("/deleteEmployeeByDesignation/{designation}")
	public List<Employee> deleteEmployeeByDesignation(@PathVariable String designation){
		return employeeService.deleteEmployeeByDesignation(designation);
	}
	
	@GetMapping("/getEmployeeByDesignation/{designation}")
	public Employee getEmployeeByDesignation(@PathVariable String designation){
		return employeeService.getEmployeeByIdByDesignation(designation);
	}
}
