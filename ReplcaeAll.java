package com.techtalk.debu.java8.map;

/*
 * @Author Debu Paul
 */

import java.util.HashMap;
import java.util.Map;

public class ReplcaeAll {

	public static void main(String[] args) {
		Map<String, Boolean> booleanMap = new HashMap<String, Boolean>(2);
		booleanMap.put("A", Boolean.TRUE);
		booleanMap.put("B", Boolean.FALSE);
		booleanMap.put("C", Boolean.TRUE);

		System.out.println("Hashmap created, here are the values");

		// Print out the map
		booleanMap.forEach((k, v) -> System.out.println(k + " " + v));

		// booleanMap.replaceAll(function);
		booleanMap.replaceAll((k, v) -> Boolean.FALSE);

		System.out.println("Hashmap replaceAll, here are the values");

		long startTime = System.currentTimeMillis();

		// Print out the modified values
		booleanMap.forEach((k, v) -> System.out.println(k + " " + v));

		long stopTime = System.currentTimeMillis();

		System.out.println("Replace took time " + (stopTime - startTime));
	}

}
