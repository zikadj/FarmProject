package com.farm.service;


import java.util.List;
import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.farm.entity.EmployeeEntity;
import com.farm.repository.EmployeeRepository;

import jakarta.transaction.Transactional;

@Service

public class EmpoyeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	public List<EmployeeEntity> getAllEmployees() {
		return employeeRepository.findAll();
	}

	public Optional<EmployeeEntity> getEmployeeById(Long empId) {
		return employeeRepository.findById(empId);
	}

	public EmployeeEntity createEmployee(EmployeeEntity employee) {
		return employeeRepository.save(employee);
	}

	public EmployeeEntity updateEmployee(Long empId, EmployeeEntity employeeDetails) {
		EmployeeEntity employee = employeeRepository.findByEmpId(empId);
		employee.setName(employeeDetails.getName());
        employee.setAge(employeeDetails.getAge());
        employee.setPhoneNumber(employeeDetails.getPhoneNumber());
        employee.setDesignation(employeeDetails.getDesignation());
        employee.setSelary(employeeDetails.getSelary());
        
        return employeeRepository.save(employee);
	}
	
	public void deleteEmpolyee(Long empId) {
		employeeRepository.deleteById(empId);
	}
	
	@Transactional
	public void transferEmployee(Long fromId, Long toId) {
		EmployeeEntity employeeFrom = employeeRepository.findByEmpId(fromId);
		
		EmployeeEntity employeeTo = employeeRepository.findByEmpId(toId);
		
		employeeFrom.setDesignation("Transferred");
		
		employeeTo.setDesignation("New position");
		
		employeeRepository.save(employeeFrom);
		
		employeeRepository.save(employeeTo);
		
		if(true) {
			throw new 
			RuntimeException("Simulated error to trigger rollback");
		}
			
	}

}
