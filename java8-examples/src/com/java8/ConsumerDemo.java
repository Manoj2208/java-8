package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		// example for consumer which accepts one argument and returns nothing
		 List<Integer> list1 = new ArrayList<Integer>();
	        list1.add(2);
	        list1.add(1);
	        list1.add(3);
		Consumer<Integer> num = (a) -> {
			System.out.println(a);
		};
		num.accept(23);
		System.out.println();

		Consumer<List<Integer>> modify = list -> {
			for (int i = 0; i < list.size(); i++) {
				list.set(i, 2 * list.get(i));

			}

		};
		Consumer<List<Integer>> display = list -> list.forEach(i -> System.out.println(i));
		modify.accept(list1);
		display.accept(list1);
	}
	 
}
