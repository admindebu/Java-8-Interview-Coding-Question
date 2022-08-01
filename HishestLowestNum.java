/**
 * 
 */
package com.techtalk.debu.java8.code;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 * @author Debu Paul
 *
 */
public class HishestLowestNum {

	public static void main(String[] args) {

		Integer highest = Stream.of(1, 2, 3, 77, 6, 5)
				          .max(Comparator.comparing(n  -> Integer.valueOf(n))).get();
		System.out.println("Highest Number : " + highest);
		

		Integer lowest = Stream.of(1, 2, 3, 77, 6, 5)
				          .min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Lowest Number : " + lowest);

	}

}
