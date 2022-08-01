/**
 * 
 */
package com.techtalk.debu.java8.code;

/**
 * @author Debu Paul
 *
 */
public class ThreadExamplelAMBDA {

	public static void main(String[] args) {

		Thread t1 = new Thread(() -> {
			System.out.println("Hello");
			
		});
	
	t1.start();
	
	Thread t2 = new Thread(new Runnable() {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
	});

	}
  // (k,v) -> {}
}
