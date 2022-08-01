package com.techtalk.debu.java8.stream;

import java.util.Arrays;
import java.util.List;

public class StreamOrderCheap {
	
	private long counter;

	private void wasCalled() {
		counter++;
	}

	public static void main(String[] args) {

		List<String> list = Arrays.asList("abc1", "abc2", "abc3");

		StreamOrderCheap obj = new StreamOrderCheap();
		obj.counter = 0;

		long size = list.stream().skip(2).map(element -> {
			obj.wasCalled();
			return element.substring(0, 3);
		}).count();
		
		System.out.println(obj.counter);

		System.out.println(size);

	}

}
