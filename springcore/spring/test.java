package com.springcore.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		
		 System.out.println("aditya");
     ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/spring/config.xml");
     App a = (App) con.getBean("app1");
     System.out.println(a);

	}

}
