/**
 * 
 */
package com.techtalk.debu.java8.code;

import java.util.ArrayList;

/**
 * @author Debu Paul
 *
 */
public class SquareSumOfNumberLessThan100 {
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		 
	    list.add(2);  // 4 < 100
	    list.add(16); // 256 > 100
	    list.add(3); // 9 < 100
	    list.add(4); // 16 < 100
	    list.add(15); // 225 > 100
	    list.add(8);  // 64 < 100
	    list.add(9);  // 81 < 100 
	    
	    int result = list.stream().mapToInt(n -> n*n).filter(n ->  n < 100).sum();
	    System.out.println("Result is : " +  result);
	}
	


}
