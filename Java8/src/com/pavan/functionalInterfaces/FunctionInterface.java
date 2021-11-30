package com.pavan.functionalInterfaces;

import java.util.function.Function;

public class FunctionInterface {

	public static void main(String[] args) {
		
		Function<Integer,Integer> functionInterface = i -> i*2;
		
		System.out.println(functionInterface.apply(4));
		
		Function<Integer,Integer> functionInterface2 = i -> i*i;
		System.out.println(functionInterface.compose(functionInterface2).apply(4));
		
		System.out.println(functionInterface.andThen(functionInterface2).apply(4));
		
		Function<Integer,Integer> functionInterface3 = Function.identity();
		System.out.println(functionInterface3.apply(10));
	}

}
