package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
    	//Constructor Injection
    	@SuppressWarnings("resource")
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
    	Emp e1=(Emp)ctx.getBean("constructorObj");
    	Room r1=(Room)ctx.getBean("room");
    	Building b1=(Building)ctx.getBean("Building");
    	
    	e1.display();
    	r1.toString();
    	b1.display();
    }
}
