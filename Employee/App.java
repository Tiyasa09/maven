package com.hibernateExample;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App {
	public static void main(String[] args) {
		SessionFactory s = new Configuration().configure().buildSessionFactory();
		Session ses = s.openSession();
		Transaction t = ses.beginTransaction();
		Employee e = new Employee();
		e.setEmpId(101);
		e.setEmpFirstName("Sankalpa");
		e.setEmpLastName("Das");
		e.setEmpEmail("sank@gmail.com");
		e.setEmpPhone(12345679);
		e.setEmpAddr("Behala");
		e.setEmpSalary(1200.98);
		ses.save(e);
		t.commit();
		ses.close();
	}
}