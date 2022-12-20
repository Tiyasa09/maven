package com.hibernateExample;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Employee_Details")
public class Employee {
	@Id
	private int empId;
	private String empFirstName, empLastName, empEmail, empAddr;
	private double empSalary;
	private long empPhone;
}
