/**
 * 
 */
package com.techtalk.debu.java8.code;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Debu Paul
 *
 */
public class RemoveDuplicateELementsList {

	public static void main(String[] args) {
		
		 Integer[] arr1 = new Integer[] { 1, 9, 8, 7, 7, 8, 9 };
		 List<Integer> nums = Arrays.asList(arr1);
		 
		 nums.stream().distinct().sorted(Comparator.reverseOrder()).forEach(n -> System.out.print( n + " ,"));
	}
}
