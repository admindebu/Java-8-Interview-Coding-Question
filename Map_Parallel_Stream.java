package com.techtalk.debu.java8.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Map_Parallel_Stream {

	public static void main(String[] args) {
		Map<String, String> wordCounts = new HashMap<>();

		wordCounts.put("usa", "U");
		wordCounts.put("jobs", "J");
		wordCounts.put("software", "S");
		wordCounts.put("technology", "T");
		wordCounts.put("opportunity", "O");

		List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

		System.out.println("===================================");

		myList.stream().filter(p -> p.startsWith("a")).map(String::toUpperCase).sorted().forEach(System.out::println);
        
		// Convert Map to Stream
	//	Stream<Map.Entry<String, String>> stream = mapToStream(wordCounts);

	}
	

}
