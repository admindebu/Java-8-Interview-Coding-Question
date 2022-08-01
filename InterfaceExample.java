/**
 * 
 */
package com.techtalk.debu.java8.code;

/**
 * @author Debu Paul
 *
 */
@FunctionalInterface
public interface InterfaceExample {

	public void pain();
	


	public default void hello() {

		System.out.println("Hello");
	}
	
	public default void hello1() {

		System.out.println("Hello");
	}
	
	public default void hello2() {

		System.out.println("Hello");
	}
	
	static void helloWOrld() {

		System.out.println("Hello WOrld");
	}
	

}
