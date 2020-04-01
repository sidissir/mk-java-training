package collections.linear;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		// List is an interface
		// ArrayList can store duplicates

		List<String> subjectList = new ArrayList<String>();

		subjectList.add("Telugu");
		subjectList.add("English");
		subjectList.add("Maths");
		subjectList.add("Science");
		subjectList.add("Social");
		// You can not add a value which is not string
		// subjectList.add(123);
		
		
		for (String sub : subjectList) {
			System.out.println(sub);
		}

		int listSize = subjectList.size();
		System.out.println(listSize);
		// To add a new element to ArrayList
		subjectList.add("Hindi");
		
		//To read a value from ArrayList
		System.out.println(subjectList.get(2));
		
		listSize = subjectList.size();
		System.out.println(listSize);

		if (subjectList.isEmpty() == true) {
			System.out.println("List is Empty");
		} else {
			System.out.println("List is Not Empty");
		}

		if (subjectList.contains("Maths")) {
			System.out.println("Subject is present");
		} else {
			System.out.println("Not Present");
		}
		
		System.out.println(subjectList);

		subjectList.remove(5);
		System.out.println(subjectList);
		
		subjectList.add("Social");
		System.out.println(subjectList);
		
		
		System.out.println("===================================================");
		List<Double> marksList = new ArrayList<Double>();
		
		
		marksList.add(99.5);
		marksList.add(98.5);
		marksList.add(34.5);
	//	marksList.add("Please pass me");
		


		

	}

}
