package com.techtalk.debu.java8.map;

/*
 * @Author Debu Paul
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class IteratingJava8 {

	public static void main(String[] args) {

		// Vector
		Vector<String> vector = new Vector<String>();
		vector.add("Pramati");
		vector.add("Imaginea");
		vector.add("SpotClues");
		vector.add("WaveMaker");
		vector.forEach((v) -> System.out.println(v));

		System.out.println("==============================");

		// ArrayList
		List<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(6);
		list.add(7);
		list.add(10);
		list.forEach((v) -> System.out.println(v));

		System.out.println("==============================");

		Set<String> set = new HashSet<String>();
		set.add("Value");
		set.add("Key");
		set.add("Result");
		set.forEach( System.out::println);
		//set.forEach(v-> System.out::print);

		System.out.println("==============================");
		// HashMap
		Map<String, Integer> wordCounts = new HashMap<>();
		wordCounts.put("usa", 100);
		wordCounts.put("jobs", 200);
		wordCounts.put("software", 50);
		wordCounts.put("technology", 70);
		wordCounts.put("opportunity", 200);
		wordCounts.forEach((k, v) -> System.out.println("Key is : " + k + " || Value is : " + v));
	}

}
