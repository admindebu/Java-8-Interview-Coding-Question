package com.techtalk.debu.java8.stream;

import java.util.stream.Stream;

public class StreamBuilderExample {

	public static void main(String[] args) {
		// When builder is used the desired type should be additionally
		// specified in the right part of the statement, otherwise the build()
		// method will create an instance of the Stream<Object>:
		
		Stream<String> streamBuilder =
				  Stream.<String>builder().add("a").add("b").add("c").build();
		streamBuilder.forEach(k->System.out.println(k));
	}

}
