package com.class17;

public class Phone {
//	 TASK 1
	
		//Create a Class “Phone”. Create 3 Objects of it:
		//	iPhone, Android, Nokia with specific  attributes and behaviours
	
	//define features, attributes
			String  brand, name ;
			
			int size, memory, ram;
			
			//define behavior, actions
			void videoRecord() {// method header
				//method body
				System.out.println("I can video record "+name);
			}
			
			void speakLong() {
				System.out.println("I can speak long time "+name);
			}
			
		//	void watchMovie() {
		//		System.out.println("I can watch movie on my "+name);
			//}
			///////////////////////////////////////////////////////////////////////
			public static void main(String[] args) {
				
				Phone phone1=new Phone();
				phone1.brand="Apple";
				phone1.name="7s";
				phone1.memory=16;
				
				System.out.println("I have "+phone1.brand+" "+phone1.name);
				phone1.videoRecord();
				phone1.speakLong();
				
				
				System.out.println("---Creating 2 object of a phone type---");
				
				
				Phone phone2=new Phone();
				phone2.brand="Nokia";
				phone2.name="i8";
				phone2.memory=16;
				
				phone2.videoRecord();
				phone2.speakLong();
				
			
				System.out.println("---Creating 2 object of a phone type---");
				
				
				Phone phone3=new Phone();
				phone3.brand="Android";
				phone3.name="7";
				phone3.memory=32;
				
				phone3.videoRecord();
				phone3.speakLong();
				
			}
		}
		
		
		
		


