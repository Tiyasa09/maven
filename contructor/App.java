package com.Constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.Entity.Student;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext app = new ClassPathXmlApplicationContext("context.xml");
        Student s=(Student)app.getBean("X");
        s.display();
    }
}
