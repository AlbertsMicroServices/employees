package com.employee.test.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Employee implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne(cascade=CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Genders idGen;
	
	@ManyToOne(cascade=CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Jobs idJob;
	
	private String name;
	private String lastName;
	private Date birthDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Genders getIdGen() {
		return idGen;
	}
	public void setIdGen(Genders idGen) {
		this.idGen = idGen;
	}
	public Jobs getIdJob() {
		return idJob;
	}
	public void setIdJob(Jobs idJob) {
		this.idJob = idJob;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public Employee() {
		super();
	}

}
