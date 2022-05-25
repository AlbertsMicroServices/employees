package com.employee.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.test.entities.Genders;
import com.employee.test.entities.Jobs;

public interface GenderRepository extends JpaRepository<Genders, Integer>{

}
