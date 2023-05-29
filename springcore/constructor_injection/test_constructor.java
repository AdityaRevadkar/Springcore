package com.springcore.constructor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test_constructor {

	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/constructor_injection/config.xml");
		
		Student s = (Student) con.getBean("student");
		System.out.print(s);
	}

}
