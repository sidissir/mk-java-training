package javaio.consoleio;

import java.util.Scanner;

public class ReadFromConsole {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name :");
		String name = sc.nextLine();
		System.out.println("You Entered : " + name);
		
		System.out.println("Enter Age :");
		int age =  sc.nextInt();
		System.out.println("Your Age : " + age);

		System.out.println("Done");
	
		
		
		
	}

}
