package com.employee.test.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.employee.test.entities.Employee;
import com.employee.test.entities.Genders;
import com.employee.test.entities.Jobs;
import com.employee.test.repository.EmployeeRepository;
import com.employee.test.repository.GenderRepository;
import com.employee.test.repository.JobsRepository;



@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepo;
	
	@Autowired
	private JobsRepository jobRepo;
	
	@Autowired
	private GenderRepository genderRepo;
	
	public Employee save(Employee employee) {
		Employee newEmployee= employeeRepo.save(employee);
		return newEmployee;
		
	}
	
	public Employee getEmployeeByIdJob(Jobs id) {
		return employeeRepo.findById(id);
	}
	
	public Jobs saveJob(Jobs job) {
		Jobs newJob=jobRepo.save(job);
		return newJob;
		
	}

	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return employeeRepo.findAll();
	}

	public Genders saveGender(Genders gender) {
		// TODO Auto-generated method stub
		Genders newGender=genderRepo.save(gender);
		return newGender;
	}
}
