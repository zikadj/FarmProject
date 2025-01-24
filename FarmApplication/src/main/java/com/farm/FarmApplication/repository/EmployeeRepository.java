package com.farm.FarmApplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.farm.FarmApplication.entity.Employee;

@Repository

public interface EmployeeRepository extends JpaRepository<Employee,Long>{

	Employee findByEmpId(Long id);
	
	List<Employee> deleteByDesignation(String designation);
	
	Employee findTopByNameOrderBySalaryDesc(String designation);
}
