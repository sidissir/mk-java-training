package javaio;

import java.io.File;
import java.io.IOException;

public class TextFileExample {

	public static void main(String[] args) throws IOException {

		
		// Create a text file
		File txtFile = new File("test1.txt");
		txtFile.createNewFile();
		System.out.println("Text File got created");
		
		
		// Create a textfile inside a particular directory
		File txtFile1 = new File("TestDir1","testinsidedir1.txt");
		txtFile1.createNewFile();
		System.out.println("Text File got created under given directory");
		System.out.println(txtFile1.getName());
		System.out.println(txtFile1.getAbsolutePath());


	}

}
