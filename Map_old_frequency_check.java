package com.techtalk.debu.java8.map;

/*
 * @Author Debu Paul
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.omg.Messaging.SyncScopeHelper;

public class Map_old_frequency_check {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(7);
		list.add(10);
		list.add(4);
		list.add(3);

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (Integer key : list) {

			if (map.containsKey(key)) {
				map.put(key, map.get(key) + 1);

			} else
				map.put(key, 1);

		}

		map.forEach((k, v) -> System.out.println("key is : " + k + " Value is : " + v));

	}

}
