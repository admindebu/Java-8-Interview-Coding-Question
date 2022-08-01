package com.techtalk.debu.java8.optional;

/*
 * @Author Debu Paul
 */

import java.util.Optional;

public class OptionalFilter {
	public static void main(String[] args) {

		Optional<String> gender = Optional.of("MALE");
		Optional<String> emptyGender = Optional.empty();

		// Filter on Optional
		System.out.println(gender.filter(g -> g.equals("male"))); // Optional.empty
		System.out.println(gender.filter(g -> g.equalsIgnoreCase("MALE"))); // Optional[MALE]
		System.out.println(emptyGender.filter(g -> g.equalsIgnoreCase("MALE"))); // Optional.empty

	}

}
