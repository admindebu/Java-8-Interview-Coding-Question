package com.techtalk.debu.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapExample {
	public static void main(String[] args) {
		
		 List<String> strings = Stream.of("one", null, "three").map(s -> {
		        if (s == null)
		            return "[unknown]";
		        else
		            return s;
		    }).collect(Collectors.toList());
		 
		 System.out.println(strings);
	}

}
