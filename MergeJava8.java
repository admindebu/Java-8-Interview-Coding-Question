package com.techtalk.debu.java8.map;

/*
 * @Author Debu Paul
 */

import java.util.HashMap;
import java.util.Map;

public class MergeJava8 {

	public static void main(String[] args) {
		Map<String, String> wordCounts = new HashMap<>();

		wordCounts.put("usa", "U");
		wordCounts.put("jobs", "J");
		wordCounts.put("software", "S");
		wordCounts.put("technology", "T");
		wordCounts.put("opportunity", "O");

		System.out.println("===================================");

		System.out.println("Before Merge Data from Map ::: ");

		wordCounts.forEach((k, v) -> System.out.println("Key is : " + k + " Value is : " + v));

		System.out.println("====================");

		// merge(key, value, remappingFunction)
		// If the specified key is not already associated with a value or is
		// associated with null, associates it with the given non-null value.
		wordCounts.merge("jobs", " - New Value Added", (v1, v2) -> v1 + v2);

		System.out.println(wordCounts.get("jobs"));

		System.out.println("====================");

		System.out.println("After Merge Data from Map ::: ");

		wordCounts.forEach((k, v) -> System.out.println("Key is : " + k + " Value is : " + v));

	}
}
