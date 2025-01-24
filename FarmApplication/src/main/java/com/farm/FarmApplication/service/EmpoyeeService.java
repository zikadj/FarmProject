package com.farm.FarmApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.farm.FarmApplication.entity.Employee;
import com.farm.FarmApplication.repository.EmployeeRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional

public class EmpoyeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	public List<Employee> saveEmployeeData(List<Employee> employeeList) {
		return employeeRepository.saveAll(employeeList);
	}

	public List<Employee> getEmployees() {
		return employeeRepository.findAll();
	}

	public Employee getEmployeeById(Long empId) {
		return employeeRepository.findByEmpId(empId);
	}

	public List<Employee> deleteEmployeeByDesignation(String designation) {
		return employeeRepository.deleteByDesignation(designation);
	}

	public Employee getEmployeeByIdByDesignation(String designation) {
		return employeeRepository.findTopByNameOrderBySalaryDesc(designation);
	}

}