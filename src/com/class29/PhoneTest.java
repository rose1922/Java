package com.class29;

public class PhoneTest {

	public static void main(String[] args) {
	
		//you cannot directly create an object of an abstract class
				//Phone phone =new Phone();CE: cannot instanciate
				
				//we can create it indirectly
				
				Phone phone=new iPhone();
				phone.makeCall();
				phone.sendText();
				phone.takePictures();
				phone.playGames();

			}
		}

	


