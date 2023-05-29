package com.springcore.anotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con = new AnnotationConfigApplicationContext(Javaconfig.class);
		demo a =con.getBean("demo",demo.class);
		System.out.println(a);

	}

}
