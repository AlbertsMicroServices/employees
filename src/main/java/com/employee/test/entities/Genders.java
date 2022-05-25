package com.employee.test.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Genders implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idGen;
	private String name;
	
	
	public int getIdGen() {
		return idGen;
	}
	public void setIdGen(int idGen) {
		this.idGen = idGen;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Genders() {
		super();
	}
	
}
