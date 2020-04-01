package collections.keyvalue;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashmapEample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating a Map
		Map<String, Double> subctMarksMap = new HashMap<String, Double>();
		// Inserting values into map

		subctMarksMap.put("Telugu", 98.5);
		subctMarksMap.put("English", 99.5);
		subctMarksMap.put("Maths", 34.5);
		subctMarksMap.put("Science", 97.5);
		subctMarksMap.put("Social", 97.5);

		System.out.println(subctMarksMap);
		// Reading a value from map
		Double teluguMarks = subctMarksMap.get("Telugu");
		System.out.println(teluguMarks);

		// I want get all the keys
		Set<String> subjectSet = subctMarksMap.keySet();
		System.out.println(subjectSet);

		// If i want to read each value

		for (String subjectKey : subjectSet) {
			System.out.print("Subject is : " + subjectKey + " : ");
			System.out.println(subctMarksMap.get(subjectKey));
		}
		
		subctMarksMap.put("Social", 97.5);

		System.out.println(subctMarksMap);
		
		subctMarksMap.put(null, 97.5);
		System.out.println(subctMarksMap);



	}

}
