/**
 * 
 */
package com.techtalk.debu.java8.code;

/**
 * @author Debu Paul
 *
 */
public class LambdaExample {
	
	/**
	 * 
	 */
	private void mai() {
		// TODO Auto-generated method stub
		
		LambdaExample obj = new LambdaExample();
		
		
		ChildClassImplements  cls = new ChildClassImplements(() -> {
			System.out.println("Helllo....");
		});
		

	}

}
