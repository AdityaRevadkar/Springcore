package com.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test_autowired {

	public static void main(String[] args) {
		ApplicationContext con= new ClassPathXmlApplicationContext("com/springcore/autowire/config.xml");
		Emp e = con.getBean("emp",Emp.class);
		System.out.print(e);
	}

}
