package com.techtalk.debu.java8.map;

/*
 * @Author Debu Paul
 */

import java.util.HashMap;
import java.util.Map;

public class computeJava8 {

	public static void main(String[] args) {
		Map<String, String> wordCounts = new HashMap<>();

		wordCounts.put("usa", "U");
		wordCounts.put("jobs", "J");
		wordCounts.put("software", "S");
		wordCounts.put("technology", "T");
		wordCounts.put("opportunity", "O");

		System.out.println("===================================");

		System.out.println("Before Compute Data from Map ::: ");

		wordCounts.forEach((k, v) -> System.out.println("Key is : " + k + " Value is : " + v));

		System.out.println("====================");

		// It will through NullPointer Exception if key is not present
		// wordCounts.compute(key, remappingFunction);
		wordCounts.compute("jobs", (k, v) -> v.concat(" - new "));
		System.out.println(wordCounts.get("jobs")); // prints "J - new"

		System.out.println("====================");

		System.out.println("After Compute Data from Map ::: ");

		wordCounts.forEach((k, v) -> System.out.println("Key is : " + k + " Value is : " + v));

	}

}
