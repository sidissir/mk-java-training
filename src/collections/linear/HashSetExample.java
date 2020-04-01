package collections.linear;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {

		// Set is a linear collection  
		//Set is not an ordered collection
		// Set can not have duplicates
		Set<String> subjectSet = new HashSet<String>();

		subjectSet.add("English");
		subjectSet.add("Telugu");
		subjectSet.add("Maths");
		subjectSet.add("Science");
		subjectSet.add("Social");

		System.out.println(subjectSet);

		for (String sub : subjectSet) {
			System.out.println(sub);
		}
		
		
		subjectSet.add("Social");
		System.out.println(subjectSet);



	}

}
