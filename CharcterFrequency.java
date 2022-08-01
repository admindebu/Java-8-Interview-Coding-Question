package com.techtalk.debu.java8.code;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CharcterFrequency {
	
	public static void main(String[] args) {
		
		String input="HelloWorld";
		
		List<Integer> list = Arrays.asList(2,3,6,8,9,10);
		list.stream().filter(n -> n % 2 ==  0 ).collect(Collectors.toList()).forEach(k->System.out.println(k));
		
		
		/*Step 1: Split the input string to get each letters using input.split("")

		Step 1: To ignore the case sensitivity we’ll use input.toLowerCase().split("")

		Step 3: using the terminal operator collect and Collectors.groupingBy(e -> e, Collectors.counting()) we’ll reduce the stream to a Map with key as String and frequency as Long.

		Step 4: Get the maps entrySet as stream .entrySet().stream()

		Step 5: Map the entry to the desired output format and print each using a forEach method.*/
		
		// Not considering the order of characters.
		Stream.of(input.toLowerCase().split(""))
        .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
        .entrySet()
        .stream()
        .map(e -> e.getKey()+ "="+e.getValue()+" ")
        .forEach(System.out::print);
		
		// Character frequency in the order of their occurrence.
		Stream.of(input.toLowerCase().split(""))
        .collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting()))
        .entrySet()
        .stream()
        .map(e -> e.getKey()+ "="+ e.getValue()+" ")
        .forEach(System.out::print);
		
		//  Print characters frequency in alphabetic order.
		Stream.of(input.toLowerCase().split(""))
        .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
        .entrySet()
        .stream()
        .sorted(Map.Entry.comparingByKey())
        .map(e -> e.getKey()+ "="+e.getValue()+" ")
        .forEach(System.out::print);
		
		// Print characters frequency in the order of most frequent one to least frequent one.
		Stream.of(input.toLowerCase().split(""))
        .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
        .entrySet()
        .stream()
        .sorted(Map.Entry.comparingByValue((a, b) -> b.compareTo(a)))
        .map(e -> e.getKey()+ "="+e.getValue()+" ")
        .forEach(System.out::print);
		
	}

	

}
