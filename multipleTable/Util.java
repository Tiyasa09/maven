package com.Multiple_Table.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Util {
	public static Session activeSession() {
		SessionFactory sFactory = new Configuration().configure().buildSessionFactory();
		Session session = sFactory.openSession();
		
		return session;
	}
}
