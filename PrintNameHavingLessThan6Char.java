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
public class PrintNameHavingLessThan6Char {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Debu","Tech","India","Bengal","Apple","Elephant");

		list.stream().filter(st -> (st.length() < 6)).forEach(s -> System.out.print(s + " ,"));
	}

}
