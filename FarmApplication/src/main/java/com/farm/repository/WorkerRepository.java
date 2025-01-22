package com.farm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.person.Worker;

@Repository

public interface WorkerRepository extends JpaRepository<Worker, Long> {

	Worker findByEmail(String email);

	Worker saveEmail(String email);

	Worker findAll(String email);

	Worker deleteByEmail(String email);

}
