package com.techtalk.debu.java8.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LimitExample {
	public static void main(String[] args) {

		List<String> vals = Stream.of("limit", "by", "two","Debu").limit(2).collect(Collectors.toList());
		
		System.out.println(vals);
		
		Stream.of(0,1,2,3,4,5,6,7,8).limit(6).forEach(num -> System.out.print("\n"+num));
	}
	
}
