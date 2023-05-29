package com.springcore.spring;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
  List<Integer> roll;

public List<Integer> getRoll() {
	return roll;
}

public void setRoll(List<Integer> roll) {
	this.roll = roll;
}

@Override
public String toString() {
	return "App [roll=" + roll + "]";
}
   
   
}
