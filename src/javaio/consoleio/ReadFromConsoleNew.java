package javaio.consoleio;

import java.util.Scanner;

public class ReadFromConsoleNew {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Name :");
		String name = sc.nextLine();
		
		while(!name.equalsIgnoreCase("end")) {
			System.out.println("You Entered : " + name);
			name = sc.nextLine();
		}
		
		System.out.println("Execution Completed");
		
	}

}
