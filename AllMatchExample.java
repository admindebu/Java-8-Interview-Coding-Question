package com.techtalk.debu.java8.stream;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllMatchExample {
	
	public static void main(String[] args) {
		 List<String> cookies = Arrays.asList("Peanut Butter Cookies",
		            "Oatmeal-Raisin Cookies", "Basic Chocolate Chip Cookies");

		    boolean containCookies = cookies.stream().allMatch(
		            p -> p.contains("Cookies"));
		    
		    System.out.println(containCookies);
	}

}
