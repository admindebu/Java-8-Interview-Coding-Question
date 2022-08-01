package com.techtalk.debu.java8.stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {

	public static void main(String... args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			list.add(i);
		}
		list.stream().forEach(System.out::println);
		list.parallelStream().forEach(System.out::println);
		
	}
}
