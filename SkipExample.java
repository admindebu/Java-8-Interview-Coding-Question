/**
 * 
 */
package com.techtalk.debu.java8.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Debu Paul
 *
 */
public class SkipExample {
	
	public static void main(String[] args) {
		List<String>  list = Stream.of("limit", "by", "two","Debu").skip(2).collect(Collectors.toList());
		System.out.println(list);
		
		Stream.of(0,1,2,3,4,5,6,7,8).skip(6).forEach(n -> System.out.println(n));
	}

}
