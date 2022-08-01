/**
 * 
 */
package com.techtalk.debu.java8.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Debu Paul
 *
 */
public class StringCharFrequency {
	
	// Example : Input ->  "OPTIMUM" -> O/P -> O 1, P - 1 , T -1 , I - 1 , M 2, U 1
	// Input : "OPTImuM ->  m 1 , M 1
	public void findFreqncyInString(String str) {
		
		// 1. Intermediate operation : map(), sort(),filter() 2. Terminal or final operation : collect()
		// COnvert anything to Stream
		
		Stream.of(str.toUpperCase().split("")) // COnverting Stream  + taking each charcter
		.collect(Collectors.groupingBy(c -> c,Collectors.counting())) 
		// Terminal
		.entrySet()
		.stream() // converting Stream
		.map(obj -> obj.getKey() + "-" + obj.getValue() + " ,") // Intermediate 
		.forEach(k->System.out.print(k));	// Terminal 
		
		// Consumer -> accept()
		// FUntion -> apply() - a , b
		// Supplier ->  supply()
		/*
		ArrayList<String> s = new ArrayList<>();
		s.add("Debu");
		s.add("Vishal");
		
		s.forEach(val -> System.out.println(val));
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("OPT",1);
		map.put("CTS", 2);
		
		map.forEach( (k,v) -> System.out.println(k + " : " +  v));
		*/
	}
	
	public static void main(String[] args) {
		StringCharFrequency obj = new StringCharFrequency();
		obj.findFreqncyInString("opTimum");
	}

}
