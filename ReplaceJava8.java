package com.techtalk.debu.java8.map;

/*
 * @Author Debu Paul
 */

import java.util.HashMap;
import java.util.Map;

public class ReplaceJava8 {

	public static void main(String[] args) {
		Map<String, Integer> wordCounts = new HashMap<>();

		wordCounts.put("usa", 100);
		wordCounts.put("jobs", 200);
		wordCounts.put("software", 50);
		wordCounts.put("technology", 70);
		wordCounts.put("opportunity", 200);
		wordCounts.put("java", null);

		System.out.println("===================================");

		System.out.println("Before Replace Data from Map ::: ");

		wordCounts.forEach((k, v) -> System.out.println("Key is : " + k + " Value is : " + v));

		// wordCounts.replace(key, oldValue, newValue);

		wordCounts.replace("jobs", 200, 2000);

		System.out.println("After Replace Data from Map ::: ");

		wordCounts.forEach((k, v) -> System.out.println("Key is : " + k + " Value is : " + v));

	}

}
