package com.farm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.farm.entity.EmployeeEntity;
import com.farm.service.EmpoyeeService;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

	@Autowired
	EmpoyeeService employeeService;
	
@GetMapping public List<EmployeeEntity> getAllEmployees(){
	return employeeService.getAllEmployees();
}

@GetMapping("/{id}")
public ResponseEntity<EmployeeEntity> getEmployeeById(@PathVariable Long id) {
    return employeeService.getEmployeeById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    
}

@PostMapping public EmployeeEntity createEmployee(@RequestBody EmployeeEntity employee) {
	return employeeService.createEmployee(employee);
	
}

@PutMapping("/{id}")
public ResponseEntity<EmployeeEntity> updateEmployee(@PathVariable Long id, @RequestBody EmployeeEntity employeeDetails){
	EmployeeEntity updateEmployee = employeeService.updateEmployee(id, employeeDetails);
	
	return ResponseEntity.ok(updateEmployee);
}

@DeleteMapping("/{id}")
public ResponseEntity<Void> deleteEmployee(@PathVariable Long id){
	employeeService.deleteEmpolyee(id);
	return ResponseEntity.noContent().build();
}


@RequestMapping("/employees")

	@PostMapping("/transfer/{fromId}/{toId}")
public ResponseEntity<String> transferEntity(@PathVariable Long fromId, @PathVariable Long toId){
	try {
		employeeService.transferEmployee(fromId, toId);
		return ResponseEntity.ok("Transfer successful");
	}catch (RuntimeException e) {
		return ResponseEntity.status(500).body("Transfer faild: " + e.getMessage());
	}
}

		
	}
	
	


	
	

