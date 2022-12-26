package org.anudip;

import org.anudip.pojo.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("---------------------dependency pulling/searching-----------");
		System.out.println("----------------setter approach------------");
		Student s1 = new Student();
		s1.setId(10);
		s1.setName("Pallabi");
		System.out.println(s1);
		System.out.println("---------------constructor approach-----------");
		Student s2 = new Student(12, "anju");
		System.out.println(s2);
		System.out.println("---------------------dependency pushing/Injecting-------------------");

	}
}
