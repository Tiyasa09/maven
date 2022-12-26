package com.BookStore.util;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BookUtil {
	private static SessionFactory SessionFactory;
	static {
		try {
			SessionFactory=new Configuration().configure().buildSessionFactory();
			}catch(Exception e) {
			System.out.println(e);
		}
	}
	public static SessionFactory getSessionFactory() {
		return SessionFactory;
	}
}

