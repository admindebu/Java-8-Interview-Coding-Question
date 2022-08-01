package com.techtalk.debu.java8.optional;

/*
 * @Author Debu Paul
 */

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class mapOptional {

	public static void main(String[] args) {
		List<String> companyNames = Arrays.asList("paypal", "oracle", "", "microsoft", "Pramati", "", "apple");
		Optional<List<String>> listOptional = Optional.of(companyNames);

		int size = listOptional.map(List::size).orElse(0);

		System.out.println(size);

	}

}
