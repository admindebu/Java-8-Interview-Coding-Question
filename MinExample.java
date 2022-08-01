package com.techtalk.debu.java8.stream;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class MinExample {
public static void main(String[] args) {
	
	
	 OptionalInt minimum = IntStream.of(1, 2, 3).min();
	 System.out.println(minimum);
	 
	 // A container object which may or may not contain a int value.If a value is present, isPresent() will return true and getAsInt() will return the value. 

}
}
