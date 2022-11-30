package com.java8;

import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
		Predicate<Integer> lesserThanHundred = (i) -> i < 100;
		// System.out.println(lesserThanHundred.test(57));
		System.out.println();
		Predicate<Integer> greaterThanFifty = (i) -> i > 50;
		// boolean result=greaterThanFifty.and(lesserThanHundred).test(167);
		// the below statement is to negate the operation of predicate logic
		boolean result = greaterThanFifty.and(lesserThanHundred).negate().test(123);
		System.out.println(result);
	}

}
