package com.farm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.farm.entity.EmployeeEntity;

@Repository

public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long>{

	EmployeeEntity findByEmpId(Long id);
	
	List<EmployeeEntity> deleteByDesignation(String designation);
	
	
}
