package com.techtalk.debu.java8.map;

/*
 * @Author Debu Paul
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveIfCollection {

	public static boolean isPrime(int number) {

		boolean flag = false;
		for (int i = 2; i <= number / 2; ++i) {
			// condition for nonprime number
			if (number % i == 0) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(2);
		numbers.add(5);
		numbers.add(6);
		numbers.add(11);
		numbers.add(21);

		/*
		 * Iterator<Integer> iterator = numbers.iterator(); while
		 * (iterator.hasNext()) { Integer next = iterator.next(); if
		 * (isPrime(next)) { iterator.remove(); } }
		 */

		// numbers.removeIf(filter);
		numbers.removeIf(integer -> isPrime(integer));

		numbers.forEach((v) -> System.out.print(v + ","));

	}

}
