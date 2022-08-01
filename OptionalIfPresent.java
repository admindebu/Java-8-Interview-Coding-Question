package com.techtalk.debu.java8.optional;

/*
 * @Author Debu Paul
 */

import java.util.Optional;

import org.omg.Messaging.SyncScopeHelper;

public class OptionalIfPresent {

	public static void main(String[] args) {

		String s = "Imaginea";
		String s1 = null;

		Optional<String> opt = Optional.ofNullable(s);
		opt.ifPresent(n -> System.out.println(n));

		// Not Get any Exception
		Optional<String> opt1 = Optional.ofNullable(s1);
		opt1.ifPresent(n -> System.out.println(n));

		// Exception
		Optional<String> opt2 = Optional.of(s1);
		opt2.ifPresent(n -> System.out.println(n));

	}

}
