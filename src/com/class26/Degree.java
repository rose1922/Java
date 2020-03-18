package com.class26;

public class Degree {
	
	public void getDegree() {
		System.out.println("i got a degree");
	}}

class Undergraduate extends Degree {
	@Override
	public void getDegree() {
		System.out.println("i am a undergraduate");
	}}

class Postgraduate extends Degree{
	@Override
	public void getDegree() {
		System.out.println("i am a postgraduate");
	}

}
