package com.java8;

import java.util.function.Function;

public class FunctionDemo {
	public static void main(String[] args) {
		Function<Integer,Double> funcn=i->i/2.0;
		//funcn=funcn.andThen(i->i*2.0);
		//here compose is works before Function funcn method but above andThen method works after the Funcn funcn
		funcn=funcn.compose(i->3*i);
		System.out.println(funcn.apply(12));
		
	}

}
 