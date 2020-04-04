package javaio.textfileio;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToTextFile {

	public static void main(String[] args) throws FileNotFoundException {

		
		// Java provides multiple classes to write to text file.
		// Out of all the classes, PrintWriter is the most advance class
		// This example explains you how to make use of PrintWriter class
		
		PrintWriter writerObject = new PrintWriter("TestDir1/testinsidedir1.txt");
		writerObject.println("Ankitha");
		writerObject.print("|");
		writerObject.println("Praveena");
		writerObject.println("Ramya");
		writerObject.println("Prashanthi");
		writerObject.println(123);
		writerObject.println('A');
		writerObject.println(true);
		writerObject.println(123.34);



		
		writerObject.flush();
		writerObject.close();
		
	}

}
