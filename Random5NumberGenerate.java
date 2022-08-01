/**
 * 
 */
package com.techtalk.debu.java8.code;

import java.util.Random;

/**
 * @author Debu Paul
 *
 */
public class Random5NumberGenerate {
	
	public static void main(String[] args) {
		Random rand	 = new Random();
		rand.ints().limit(5).forEach(num -> System.out.print(num + ","));
		
		// Sorted order 
		
		System.out.println("Sorted Order ... ");
		rand.ints().limit(5).sorted().forEach(num -> System.out.print(num + ","));
	}

}
