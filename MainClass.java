package com.techtalk.debu.java8.optional;
/*
 * @Author Debu Paul
 */

import java.util.Optional;

public class MainClass {

	public static void main(String[] args) {

		Address home = new Address("5B", "Chennai", "Tamil Nadu", "India");
		Optional<Address> opt = Optional.of(home);
	}

}
