package com.techtalk.debu.java8.map;

/*
 * @Author Debu Paul
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IteratiingMapBefore8 {

	public static void main(String[] args) {
		Map<String, Integer> wordCounts = new HashMap<>();
		wordCounts.put("usa", 100);
		wordCounts.put("jobs", 200);
		wordCounts.put("software", 50);
		wordCounts.put("technology", 70);
		wordCounts.put("opportunity", 200);

		// Method :: 1
		// using enhanced for-each loop for iteration over Map.entrySet()
		for (Map.Entry<String, Integer> entry : wordCounts.entrySet())
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

		// Method :: 2
		// using Map.keySet()
		Iterator<String> itr1 = wordCounts.keySet().iterator();

		while (itr1.hasNext()) {

			String key = itr1.next();
			Integer value = wordCounts.get(key);
			System.out.println("Key = " + key + ", Value = " + value);
		}

		// Method :: 3
		// using iterators
		Iterator<Entry<String, Integer>> itr = wordCounts.entrySet().iterator();

		while (itr.hasNext()) {
			Entry<String, Integer> entry = itr.next();
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}

		// Method :: 4
		// using keySet() for iteration over keys
		for (String name : wordCounts.keySet())
			System.out.println("key: " + name);

		// using values() for iteration over keys
		for (Integer url : wordCounts.values())
			System.out.println("value: " + url);

		// Method :: 5
		// looping over keys
		for (String name : wordCounts.keySet()) {
			// search for value
			Integer url = wordCounts.get(name);
			System.out.println("Key = " + name + ", Value = " + url);
		}
	}
}
