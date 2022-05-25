package com.employee.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.test.entities.Employee;
import com.employee.test.entities.EmployeeWorkedHours;
import com.employee.test.entities.Jobs;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	Employee findById(Jobs id);
	
}
