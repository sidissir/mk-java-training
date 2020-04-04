package javaio;

import java.io.File;

public class DirectoryExample {

	public static void main(String[] args) {

		
		//File class 
		
		// Create a Directory
		File dirFile = new File("TestDir1");
		
		dirFile.mkdir();
		
		System.out.println("Done");
		
		
	}

}
