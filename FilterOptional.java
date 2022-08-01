package com.techtalk.debu.java8.optional;

/*
 * @Author Debu Paul
 */

import java.util.Optional;

public class FilterOptional {

	public static void main(String[] args) {

		Integer year = 2016;
		Optional<Integer> yearOptional = Optional.of(year);
		boolean is2016 = yearOptional.filter(y -> y == 2016).isPresent();

		System.out.println(is2016);

		boolean is2017 = yearOptional.filter(y -> y == 2017).isPresent();
		System.out.println(is2017);

	}

}
