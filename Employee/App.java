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
		e.setEmpFirstName("Tiyasa");
		e.setEmpLastName("Naskar");
		e.setEmpEmail("tiyasa@gmail.com");
		e.setEmpPhone(12345679);
		e.setEmpAddr("Sonarpur");
		e.setEmpSalary(1200.98);
		ses.save(e);
		t.commit();
		ses.close();
	}
}
