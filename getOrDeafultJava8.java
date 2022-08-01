package com.techtalk.debu.java8.map;

/*
 * @Author Debu Paul
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class getOrDeafultJava8 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(7);
		list.add(10);
		list.add(4);
		list.add(3);

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (Integer key : list) {

			// map.getOrDefault(key, defaultValue);

			int val = map.getOrDefault(key, 0);

			// if key prsent then value will return of the key else default
			// value will return
			map.put(key, val + 1);
			

		}

		map.forEach((k, v) -> System.out.println("key is : " + k + " Value is : " + v));

	}
}
