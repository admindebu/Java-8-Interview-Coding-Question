/**
 * 
 */
package com.techtalk.debu.java8.code;

import java.util.Optional;

/**
 * @author Debu Paul
 *
 */
public class OPtionalClassExample {
	
	String name;
	
	public static void main(String[] args) {
		
		OPtionalClassExample obj = new OPtionalClassExample();
		Optional<String> optionalObj = Optional.ofNullable(obj.name);
		obj.name = optionalObj.orElse("TechTalkDebu");

		
		System.out.println(obj.name);
		
/*		if(optionalObj.isPresent())
		System.out.println(obj.name);
		else 
			System.out.println("Object name having null value");*/
	}

}
