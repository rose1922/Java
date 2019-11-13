package com.class14;

public class StringMethodsRecap {

	public static void main(String[] args) {
		// .replace
		
		String str="your Syntax Technologies. is your place to study";
		System.out.println(str.replace('y','i'));
		
		System.out.println("*************");
		System.out.println(str.replace("your", "My"));
		
		System.out.println("***************");
		
		//.replaceAll
		
		String str2="Video provides a powerful way to help you prove your point. " 
					+"When you click Online video, you can paste in embed "	
				    +"code for the video want to add";
		System.out.println(str2.replaceAll("to(.*)", ""));
		
		System.out.println("*******************");
		
	String str3="2342Hell3049o";//kontrol et
	System.out.println(str3.replaceAll("[0-9]", ""));
	System.out.println(str3.replaceAll("[^a-zA-Z^]", ""));
	
	System.out.println("**************");
	
	System.out.println(str2.replaceFirst(" ", ""));
	System.out.println(str3.replaceAll("\\w, arg1));///eksik

	}

}
