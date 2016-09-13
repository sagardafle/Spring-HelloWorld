package com.sagardafle;
/**
 * 
 * Greeter.java
 * Interface class that has the following methods.
 * setName() and getGreeting()
 * 
 * @author SagarDafle
 */

public interface Greeter {

/**
 * Sets the name of the author as user name.
 * @param name is the actual user name for the author.
 */
	void setName(String name);
	
/**
* Displays the welcome greeting to the user.
* @return greeting message in the form of java string.
*/	
    String getGreeting();
}
