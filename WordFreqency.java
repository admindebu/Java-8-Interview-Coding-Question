package com.techtalk.debu.java8.code;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordFreqency {

	public static void main(String[] args) {
		List <String> wordsList = new ArrayList();
		wordsList.add("Debu");
		wordsList.add("Morning");
		wordsList.add("hi");
		wordsList.add("hi");
		wordsList.add("hello");
		
		Map<String, Long> collect = 
		        wordsList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		Map<String, Integer> collect2 = 
		        wordsList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(e -> 1)));
		System.out.println(collect);		
		System.out.println(collect2);
	}

}
