package com.techtalk.debu.java8.stream;

import java.util.OptionalDouble;
import java.util.stream.Stream;

public class MaxExample {
	public static void main(String[] args) {

		OptionalDouble max = Stream.of(1d, 2d, 3d).mapToDouble(Double::doubleValue).max();

		// A container object which may or may not contain a double value.If a
		// value is present, isPresent() will return true and getAsDouble() will
		// return the value.
		System.out.println(max);

	}
}
