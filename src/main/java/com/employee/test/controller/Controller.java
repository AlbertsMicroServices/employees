package com.employee.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.test.entities.Employee;
import com.employee.test.entities.Genders;
import com.employee.test.entities.Jobs;
import com.employee.test.services.EmployeeService;

@RestController
@RequestMapping("/Employee")
public class Controller {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping
	public ResponseEntity<List<Employee>> listaEmployees(){
		List<Employee> employees=employeeService.getAll();
		if(employees.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(employees);
	}
	
	@PostMapping
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
		System.out.println("Esto trae IdGen employee "+employee.getIdGen());
		
		Employee newEmployee =employeeService.save(employee);
		System.out.println("esto trae IDGen "+ newEmployee.getIdGen());
		return ResponseEntity.ok(newEmployee);
		
	}
	
	@PostMapping("/Gender")
	public ResponseEntity<Genders> saveGenders(@RequestBody Genders gender){
		Genders newGender=employeeService.saveGender(gender);
		return ResponseEntity.ok(newGender);
		
	}
	
	@PostMapping("/Jobs")
	public ResponseEntity<Jobs> saveJobs(@RequestBody Jobs job){
		Jobs newJob=employeeService.saveJob(job);
		return ResponseEntity.ok(newJob);
	}
	
}
