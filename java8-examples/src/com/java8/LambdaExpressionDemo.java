package com.java8;

public class LambdaExpressionDemo {
	public static void main(String[] args) {
		// thread example without using lamda expression
		/*
		 * Runnable runnable=new Runnable(){
		 * 
		 * @Override public void run() { System.out.println("hi am running");
		 * 
		 * }
		 * 
		 * }; Thread t1=new Thread(runnable); t1.start();
		 * 
		 */
		Runnable r = () -> {
			System.out.println("hi am running");
		};
		Thread t1 = new Thread(r);
		t1.start();
	}
}
