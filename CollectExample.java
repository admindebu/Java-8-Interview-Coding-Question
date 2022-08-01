package com.techtalk.debu.java8.stream;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectExample {
	
	public static void main(String[] args) {
		 Set<String> stringSet = Stream.of("some", "one", "some", "one")
		            .collect(Collectors.toSet());
		 
		 System.out.println(stringSet);
		 
		 // Example
		 Stream.of("some", "one", "some", "one")
		            .forEach(p->System.out.println(p));
	}

}

