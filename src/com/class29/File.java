package com.class29;

//Create a class File that will have the following behaviors: open, edit, close.
	//Edit and close are implemented method while open is an abstract.
	//Create 3 subclasses: JavaFile, WordFile, PDFFile that will provide specific implementation of open behaviour:
		//Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc
	 
public abstract class File {
	
	public abstract void open();
	
	public void edit() {
		System.out.println("Editing the file");
	}
	public void close() {
		System.out.println("Closing the file");
	}
}

     class javaFile extends File{
    	 public void open() {
    		 System.out.println("Opening the Java file using sublime text");
    	 }
     }
     class WordFile extends File{
    	 public void open() {
    		 System.out.println("Opening the word file using Microsoft Word");
    	 }
     }
     class PDFFile extends File{
    	 public void open() {
    		 System.out.println("Opening the pdf file using Adope Reader");
    		 
    	 }	 
    		 
    	 }


