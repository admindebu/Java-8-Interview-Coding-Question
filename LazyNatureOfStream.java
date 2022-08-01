package com.techtalk.debu.java8.stream;

import java.util.stream.Stream;

public class LazyNatureOfStream {
	

		  public static void main(String args[]) {
		    Stream.iterate(0, n->n+2)   // Source
		          .peek(num -> System.out.println("Peeked at:"+num))  // Intermediate Operation
		          .limit(5) //  Intermediate Operation -- This optimization is technically named as Short-Circuiting!
		          .forEach(System.out::println); // Terminal Operation
		  }

}
