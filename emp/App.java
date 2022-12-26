package com.Employee;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {  
    public static void main(String[] args) {  
          
    	ApplicationContext app = new ClassPathXmlApplicationContext("pallabi.xml"); 
          
        Employee s=(Employee)app.getBean("e");  
        s.show();  
          
    }  
}  
