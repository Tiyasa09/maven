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
@DiscriminatorValue(value="2 wheel")
public class TwoWheeler extends Vehicle {
	private int modelno;
	private String modelname;
	private boolean abs;
	private int tyretype;
	private String btype;

}
