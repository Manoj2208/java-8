package com.java8;

public class NameToUpperCaseImpl {

	public static void main(String[] args) {

		NameToUpperCase nameToUpperCase = (String name) -> {
			System.out.println(name.toUpperCase());
			return name;
		};
		nameToUpperCase.upperCase("manu");
	}

}
