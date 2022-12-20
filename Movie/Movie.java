package com.tiyasa.Project_MavenEx.pojo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity //this annotation specifies the class is an entity
@Table(name="Movie")//the table in the db by which this entity mapped
public class Movie {
	@Id @ Column private int id;//id is for primary key
	@Column private String movieName; //name of the column in specific
	@Column private String actor;
	
	

}
