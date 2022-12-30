package com.SpringJdbc1;

import org.springframework.jdbc.core.JdbcTemplate;

public class DaoImpl implements Dao{
	
	private JdbcTemplate jdbcTemplate;
	public int insert(Student student) {
		String query = "insert into Student values(' "+student.getId()+" ',' "+student.getName()+" ' , ' "+student.getEmail()+" ' ,' "+student.getAddress()+" ' ,' "+student.getAge()+" ')";
		//return jdbcTemplate.update(query);		
		int result = this.jdbcTemplate.update(query);
		return result;
	}
	public int update(Student student,int id) {				
		System.out.println("Updated");
		return jdbcTemplate.update("UPDATE Student SET name = 'Riya', email =' riya@gmail.com', address = 'Champahati',age=24 WHERE id ="+id);
		}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate= jdbcTemplate;
	}
}
