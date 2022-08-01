package com.techtalk.debu.java8.map;

public class CreateThread extends Thread{

	

	
	public static void main(){
		
	Thread c = new Thread(()->{
			
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
				
		});
		c.start();
		
		
	}

	
}
