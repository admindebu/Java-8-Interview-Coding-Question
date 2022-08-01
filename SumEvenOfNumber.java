/**
 * 
 */
package com.techtalk.debu.java8.code;

import java.util.ArrayList;

/**
 * @author Debu Paul
 *
 */
public class SumEvenOfNumber {
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		 
        list.add(2);
        list.add(6);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(8);
        list.add(9);
        
        int result = list.stream().filter(n ->  n%2 == 0 ).mapToInt(n -> n).sum();
	    System.out.println("Result is : " +  result);
	}

}
