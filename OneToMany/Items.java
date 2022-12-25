package com.OneToMant.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="item")
public class Items {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String itemname;
	private double price;
	private int quantity;

}
