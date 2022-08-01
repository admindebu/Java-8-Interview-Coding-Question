package com.techtalk.debu.java8.optional;

import java.util.Optional;

/*
 * @Author Debu Paul
 */

public class OptionalOrElse {

	public static void main(String[] args) {

		Optional<String> gender = Optional.of("MALE");
		Optional<String> emptyGender = Optional.empty();

		// gender.orElse(other);
		System.out.println(gender.orElse("<N/A>")); // MALE
		System.out.println(emptyGender.orElse("<N/A>")); // <N/A>

		System.out.println(gender.orElseGet(() -> "<N/A>")); // MALE
		System.out.println(emptyGender.orElseGet(() -> "<N/A>")); // <N/A>

	}
}
