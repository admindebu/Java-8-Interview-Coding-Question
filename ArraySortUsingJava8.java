/**
 * 
 */
package com.techtalk.debu.java8.code;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * @author Debu Paul
 *
 */
public class ArraySortUsingJava8 {
	
	public static void main(String[] args) {
		
		
		int arr[] = {5,8,7,3,4,10,9}; //  5

	//	Integer[] arrObj = {5,8,7,3,4,10,9};
		/*Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
		}*/
		/*Arrays.stream(arr).sorted().forEach(k -> System.out.print(k + " "));*/
		
		
		/*int[] temp = Arrays.stream(arr).sorted().toArray();
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
		}*/
		
		// Decending order
		
		Arrays.stream(arr).boxed().filter(i -> i%5==0).sorted(Collections.reverseOrder()).forEach(k -> System.out.print(k + " "));
		
		//int[]  arr1 = Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).mapToInt(v->v).toArray();
	}

}
