package javaio.textfileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class TextFileExample {

	public static void main(String[] args) throws IOException {

		// In this example , we are reading one line at a time from a text file,
		// Verifying if line contains "Tendulkar" keyword, If contains , then we are
		// writing that line to another file

		BufferedReader readerObject = new BufferedReader(new FileReader("TestDir1/TextFileWithSomeText.txt"));

		PrintWriter writerObject = new PrintWriter("TestDir1/FileWithTendulkarLines.txt");

		String line = readerObject.readLine();

		while (line != null) {

			if (line.contains("Tendulkar")) {
				System.out.println(line);
				writerObject.println(line);

			}
			line = readerObject.readLine();
		}
		writerObject.flush();
		writerObject.close();
		System.out.println("Done");

	}

}
