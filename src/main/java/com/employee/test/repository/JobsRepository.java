package com.employee.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.employee.test.entities.Jobs;

public interface JobsRepository extends JpaRepository<Jobs, Integer>{

}
