package com.employee.test.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class EmployeeWorkedHours {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@OneToOne(cascade=CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Employee idEmployee;
	private int workedHours;
	private Date workedDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Employee getIdEmployee() {
		return idEmployee;
	}
	public void setIdEmployee(Employee idEmployee) {
		this.idEmployee = idEmployee;
	}
	public int getWorkedHours() {
		return workedHours;
	}
	public void setWorkedHours(int workedHours) {
		this.workedHours = workedHours;
	}
	public Date getWorkedDate() {
		return workedDate;
	}
	public void setWorkedDate(Date workedDate) {
		this.workedDate = workedDate;
	}
	public EmployeeWorkedHours() {
		super();
	}
	
}
