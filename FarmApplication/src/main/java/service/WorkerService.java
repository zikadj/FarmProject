package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.person.Worker;

import JpaRepository.WorkerRepository;

@Service

public class WorkerService {
	
	@Autowired
	private WorkerRepository workerRepository;
	
	public List<Worker> getAllWorker(){
		return workerRepository.findAll();
	}
	
	public Worker saveWorker(Worker worker) {
		return workerRepository.save(worker);
	}
	
	public Optional<Worker> getWorkerById(Long id){
		return workerRepository.findById(id);
	}
	
	public void deleteWorker(Long id) {
		workerRepository.deleteById(id);
	}
	
	public Worker getWorkerByEmail(String email) {
		return workerRepository.findByEmail(email);
	}

}
