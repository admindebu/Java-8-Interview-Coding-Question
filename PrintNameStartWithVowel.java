/**
 * 
 */
package com.techtalk.debu.java8.code;

import java.util.Arrays;
import java.util.List;

/**
 * @author Debu Paul
 *
 */
public class PrintNameStartWithVowel {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Debu","Tech","India","Bengal","Apple","Elephant");

		list.stream().map(str ->  str.toUpperCase()).filter(st -> (st.startsWith("A") || st.startsWith("E") || st.startsWith("I") || st.startsWith("O") || st.startsWith("U")))
		                          .forEach(s -> System.out.print(s + " ,"));
		
	}
}
