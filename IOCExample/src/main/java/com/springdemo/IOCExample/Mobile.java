// IOC Container - Inversion of Control

package com.springdemo.IOCExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Vodaphone  obj = new Vodaphone();
//		obj.calling();
//		obj.data();
//		
//		Sim sim = new Airtel();
//		sim.calling();
//		sim.data();
		
		
// It is a loosely coupled application
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Sim sim = (Sim) context.getBean("vodaphone");
		sim.data();
		sim.calling();
		
	}

}
