package com.syntax.class11;

public class StringVerifications {

	public static void main(String[] args) {
		
		String message="Welcome Admin!";
		//verify that message contains username which is Admin
		System.out.println(message.contains("Admin"));
		boolean flag=message.contains("welcome");
		System.out.println(flag);
		
		//we want to see if welcome starts with Welcome
		System.out.println("----------startsWith() Function--------");
		
		boolean starts=message.startsWith("Welcome");
		System.out.println(starts);
		
		//we want to verify that welcome message ends with username and!
		String username="Admin";
		
		boolean ends=message.endsWith(username);
		System.out.println(ends);
		System.out.println("Test executed on chrome browser");
		System.out.println(message.endsWith("!"));

	}

}
