package com.springcore.streriotype.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext com = new ClassPathXmlApplicationContext("com/springcore/streriotype/annotation/config.xml");
		Demo d = com.getBean("demo",Demo.class);
		System.out.println(d);

	}

}
