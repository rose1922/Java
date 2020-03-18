  package com.syntax.class09;

public class MoreArrays {

	public static void main(String[] args) {
		//arrays are fixed insize 
				//if we add more values then we decleared-->ArrayIndexOutofBoundsException
				String [] students= new String[3];
				students[0] = "Hassna";
				students[1]= "Faisal";
				students[2]= "Kemal";
				System.out.println(students[2]);
				//students[3]="Aoron";during run time java machine will give"ArrayIndexOutofBoundsException
				//if we store less elements than we decleared compiler will add default values
			  String[] inClassStudents= new String[5];
			  inClassStudents[1]="Hichem";
			  inClassStudents[2]="Tetteh";
			  inClassStudents[3]="Hichem";
			  inClassStudents[4]="Tetteh";
			  //inClassStudents[5]="Tetteh"; it will be 	no output-->Will get ArrayIndexOutofBoundException
			   
			   
			  System.out.println(inClassStudents[0]);//if you forgot to start with 0 when you print element 5 no ouptput.
			   
			}
		}
		
		

	


