package com.class33;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student{
	
	String name;
	int studentId;
	
	public Student(String name, int studentId) {
		this.name=name;
		this.studentId=studentId;
	}
	
	public void display() {
		System.out.println("My name is "+name+" and my students id id "+studentId);
	}
}

public class SudentTest {

	public static void main(String[] args) {
		//create an arraylist that will store student type of objects		
		List<Student>students=new ArrayList<>();
		//creating Student type of Objects
		Student stu=new Student("John", 101);
		Student stu1=new Student("Jane", 102);
		Student stu2=new Student("Jack", 103);
		//adding Student type of Objects
		students.add(stu);
		students.add(stu1);
		students.add(stu2);
		
		//display info of each student
		stu.display();
		System.out.println(stu.name);
		System.out.println(stu.studentId);
		stu1.display();
		//for each
		for(Student student:students) {
			student.display();
		}
		//adding more object of a Student Type
		students.add(new Student("Michael", 104));
		students.add(new Student("David", 105));
		students.add(new Student("Esra", 106));
		
		//display info of each student
		Iterator<Student> myIterator=students.iterator();
		while(myIterator.hasNext()) {
			//myIterator.next().display();
			Student obj=myIterator.next();
			obj.display();
		}
	}
}

    


