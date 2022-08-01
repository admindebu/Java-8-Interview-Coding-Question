package com.techtalk.debu.java8.map;

/*
 * @Author Debu Paul
 */

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class computeIfAbsentJava8 {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);

		System.out.println("===================================");

		System.out.println("Before Compute Data from Map ::: ");

		map.forEach((k, v) -> System.out.println("Key is : " + k + " Value is : " + v));

		System.out.println("====================");

		Function<String, Integer> function = (k) -> 0; // Default value

		// Same Value is returning, as it is present
		// map.compute(key, remappingFunction)
		map.computeIfAbsent("A", function);
		System.out.println(map.get("A"));

		// It will not through any NullPointer Exception if key is not present,
		// BUt make a entry of not present key with value
		map.computeIfAbsent("Hello", function);

		System.out.println("====================");

		System.out.println("After Compute Data from Map ::: ");

		map.forEach((k, v) -> System.out.println("Key is : " + k + " Value is : " + v));

	}
}
