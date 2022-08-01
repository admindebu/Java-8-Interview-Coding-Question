package com.techtalk.debu.java8.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class MapToStream {
	// Generic function to convert Map<K,V> to a Stream of <Map.Entry<K,V>
	private static <K, V> Stream<Map.Entry<K, V>> mapToStream(Map<K, V> map) {
		return map.entrySet().stream();
	}

	// Program to convert Map to a Stream
	public static void main(String args[]) {
		Map<String, Integer> asciiMap = new HashMap<>();

		asciiMap.put("A", 65);
		asciiMap.put("B", 66);
		asciiMap.put("C", 67);

		Stream<Map.Entry<String, Integer>> stream = mapToStream(asciiMap);

		System.out.println(Arrays.toString(stream.toArray()));
	}
}
