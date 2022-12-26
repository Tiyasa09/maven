package com.Single_Table.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@DiscriminatorValue(value="4 wheel")
public class FourWheeler extends Vehicle{
	private int modelno;
	private String modelname;
	private boolean musicsystem;
	private String etype;
	private boolean ac;
	

}

