package com.sagardafle;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldApplication {

	public static void main(String[] args) {
		ApplicationContext applicationcontext = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorldWithSpring helloworldobject = (HelloWorldWithSpring) applicationcontext.getBean("greeter");
		String greetingmessage = helloworldobject.getGreeting();
		System.out.println(greetingmessage);
	}
}
