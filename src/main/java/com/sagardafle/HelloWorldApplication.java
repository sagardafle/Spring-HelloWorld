package com.sagardafle;

/**
 * This is the class that has only one method- the main method.
 * It makes use of the Spring framework application context and ClassPathXmlApplicationContext libraries.
 * @author SagarDafle
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldApplication {

	private static ApplicationContext applicationcontext;

	/**
	 * The main method - It loads the greeter bean(Beans.xml) and get the property name and value via object. 
	 * This object is the later used to invoke the getGreeting() method that finally displays a greeting message to the respective user.
	 * @param args - nothing is passed in this application.
	 */
	public static void main(String[] args) {
		applicationcontext = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorldWithSpring helloworldobject = (HelloWorldWithSpring) applicationcontext.getBean("greeter");
		String greetingmessage = helloworldobject.getGreeting();
		System.out.println(greetingmessage);
		
	}
}
