package com.sagardafle;
/**
 * 
 * @author SagarDafle
 * Implements the Greeter interface and all of its methods.
 */

public class HelloWorldWithSpring implements Greeter{
	
	private String username;
	
	/**
	 * Sets the user name from the greeter bean. 
	 * This user name is later used by the getGreeting() function.
	 * @param  name A string that is the user's name.
	 */

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.username = name;
		
	}

	/**
	 * Displays the HelloWorld message . Greets the user and reads the user name from the
	 * Beans.xml file. 
	 * @return  A greeting message for the user.
	 */
	@Override
	public String getGreeting() {
		// TODO Auto-generated method stub
		return "Hello World from "+this.username+ "!";
		//return null;
	}

}
