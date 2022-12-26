package com.Multiple_Table.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.Data;

@Entity
@Data
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Vehicle1 {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int vid;
	
	@Column(length=10)
	private String fuel;
	
	@Column(length=10)
	private String enginepower;
	
	@Column(length=4)
	private int speed;
	
	@Column(length=10)
	private String vtype;
	
	@Column(length=4)
	private int price;
	
}
