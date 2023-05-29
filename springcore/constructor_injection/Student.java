package com.springcore.constructor_injection;

public class Student {
	private String name;
	private int Id;
	
	
	public Student(String name, int id) {
		
		this.name = name;
		Id = id;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", Id=" + Id + "]";
	}
	
	

}
