package com.java8;

import java.util.function.Supplier;

public class SupplierDemo {
	public static void main(String[] args) {
		
		//this is the example for supplier which takes no argument but provides result or returns something 
		/*
		 * Supplier<Double> randomNumber = () -> { return Math.random(); };
		 */
		Supplier<Double> randomNumber=()->Math.random();
		System.out.println(randomNumber.get());

	}

}
