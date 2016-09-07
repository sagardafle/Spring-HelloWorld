package com.sagardafle;

public class HelloWorldWithSpring implements Greeter{
	
	private String username;

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.username = name;
		
	}

	@Override
	public String getGreeting() {
		// TODO Auto-generated method stub
		return "Hello World from "+this.username+ "!";
		//return null;
	}

}
