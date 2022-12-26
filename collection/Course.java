package com.Entity;

import java.util.Iterator;
import java.util.List;

public class Course {
	private int duration;
	private String cname;
	private String trainer;
	private List<String> student;
	
	public Course(int duration, String cname, String trainer, List<String> student) {
		super();
		this.duration = duration;
		this.cname = cname;
		this.trainer = trainer;
		this.student = student;
	}

	public void display() {
		System.out.println(duration+" "+cname+" "+trainer);
		System.out.println("student list");
		Iterator<String> itr=student.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
