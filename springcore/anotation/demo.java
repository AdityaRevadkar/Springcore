package com.springcore.anotation;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;

@Component("demo")
public class demo {
@Value("aditya")
private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "demo [name=" + name + "]";
}

}
