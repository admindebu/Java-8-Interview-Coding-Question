package com.techtalk.debu.java8.map;

/*
 * @Author Debu Paul
 */

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByValueExample {

	public static Map<String, Integer> sortByValue(final Map<String, Integer> wordCounts) {
		return wordCounts.entrySet().stream().sorted((Map.Entry.<String, Integer>comparingByValue().reversed()))
				// Collectors.toMap(keyMapper, valueMapper, mergeFunction)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
	}

	public static void main(String[] args) {
		final Map<String, Integer> wordCounts = new HashMap<>();
		wordCounts.put("usa", 100);
		wordCounts.put("jobs", 200);
		wordCounts.put("software", 50);
		wordCounts.put("technology", 70);
		wordCounts.put("opportunity", 200);
		final Map<String, Integer> sortedByCount = sortByValue(wordCounts);
		System.out.println(sortedByCount);
		// Not Changed the value of original contents
		System.out.println(wordCounts);
	}

}
