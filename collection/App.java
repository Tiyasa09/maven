package com.Constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.Entity.Course;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext app = new ClassPathXmlApplicationContext("context.xml");
        Course c=(Course)app.getBean("Y");
        c.display();
    }
}
