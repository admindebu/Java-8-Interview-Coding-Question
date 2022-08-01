package com.techtalk.debu.java8.map;

/*
 * @Author Debu Paul
 */

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByKeyExample {

	public static void main(String[] args) {
		Map<String, Integer> wordCounts = new HashMap<>();

		// wordCounts.put("USA", 100);
		wordCounts.put("usa", 100);
		wordCounts.put("jobs", 200);
		wordCounts.put("software", 50);
		wordCounts.put("technology", 70);
		wordCounts.put("opportunity", 200);

		wordCounts.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByKey()).forEach(System.out::println);

	}

}
