package javaio.textfileio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromTextFile {

	public static void main(String[] args) throws IOException {

		// Make sure TestDir1/TextFileWithSomeText.txt file is present in your project
		// directory before executing this program
		BufferedReader readerObject = new BufferedReader(new FileReader("TestDir1/TextFileWithSomeText.txt"));

		String str = readerObject.readLine();

		while (str != null) {

			System.out.println(str);
			str = readerObject.readLine();
		}

		System.out.println("Done");

	}

}
