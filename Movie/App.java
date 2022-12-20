package com.tiyasa.Project_MavenEx;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.tiyasa.Project_MavenEx.pojo.Movie;
import com.tiyasa.Project_MavenEx.util.Hibernate_config;

public class App 
{
    public static void main( String[] args )
    {
    	Session session1=Hibernate_config.makeSession();
   	 System.out.println("got a session "+session1);
   	 Movie m = new Movie();
   	 m.setId(1);
   	 m.setMovieName("Pathan");
   	 m.setActor("Srk");
   	 Transaction tr = session1.beginTransaction();
   	 session1.save(m);
   	 tr.commit();
   	 session1.close();
   	 System.out.println("Object is saved using hibernate"); 
    }
}
