/**
 * 
 */
package com.techtalk.debu.java8.code;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author Debu Paul
 *
 */
public class PrintLongestStringFromList {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Debu", "Tech", "Talk", "TechTalk", "TechTalk Debu");
	    Optional<String> biggestLengthStr = list.stream().reduce((s1,s2) -> s1.length() > s2.length() ? s1 : s2);
	    
	    biggestLengthStr.ifPresent(s -> System.out.println(s));
	    
	}

}
