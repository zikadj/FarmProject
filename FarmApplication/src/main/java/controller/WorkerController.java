package controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.person.Worker;

import service.WorkerService;

@RestController
@RequestMapping("/api/worker")

public class WorkerController {

	@Autowired
	private WorkerService workerService;

	@PostMapping
	public Worker createWorker(@RequestBody Worker worker) {
		return workerService.saveWorker(worker);

	}

	@GetMapping
	public List<Worker> getAllWorker() {
		return workerService.getAllWorker();
		
	}

	@DeleteMapping("/{id}")
	public void deleteWorker(@PathVariable Long id) {
		workerService.deleteWorker(id);

	}
	
	@GetMapping("/email/{email}")
	public Worker getWorkerByEmail(@PathVariable String email) {
		return workerService.getWorkerByEmail(email);
	}

}
