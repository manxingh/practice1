package com.theopentutorials.ejb3.ejbmavendemo;

import javax.ejb.Stateless;

@Stateless
public class HelloWorldBean implements HelloWorld {
	public HelloWorldBean(){
		
	}
	
	public String sayHello(){
		return "Hello World !!!";
	}

}
