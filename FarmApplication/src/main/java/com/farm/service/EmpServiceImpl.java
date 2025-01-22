package com.farm.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farm.repository.EmployeeRepository;
import com.model.person.Employee;

@Service
public class EmpServiceImpl implements EmpService {
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public ArrayList<Employee> findAllEmployee() {
		return (ArrayList<Employee>) employeeRepository.findAll();
	}

	@Override
	public Employee findAllEmployeeByID(long id) {
		Optional<Employee> opt = employeeRepository.findById(id);
		if (opt.isPresent())
			return opt.get();
		else
			return null;
	}

	@Override
	public void addEmployee() {
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee("Lucknow", "Shubham"));
		emp.add(new Employee("Delhi", "Puneet"));
		emp.add(new Employee("Pune", "Abhay"));
		emp.add(new Employee("Noida", "Anurag"));
		for (Employee employee : emp) {
			employeeRepository.save(employee);
		}
	}

	@Override
	public void deleteAllData() {
		employeeRepository.deleteAll();
	}
}
