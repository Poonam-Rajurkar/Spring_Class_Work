package com.sprdemo.DITypeDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext springContainer = new ClassPathXmlApplicationContext("beans.xml");
        
        Performer sp1 = (Performer) springContainer.getBean("shape");
        sp1.perform();
    }
}
