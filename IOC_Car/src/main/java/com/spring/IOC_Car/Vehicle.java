package com.spring.IOC_Car;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Engine e1 = (Engine) context.getBean("bike");
		e1.singalEngine();
		e1.ecgEngine();
		
		Engine e2 = (Engine) context.getBean("car");
		e2.singalEngine();
		e2.ecgEngine();
	}

}
