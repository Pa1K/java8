package com.pavan.functionalInterfaces;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Bi {

	public static void main(String[] args) {
		
		BiPredicate<Integer,Integer> checkSumofTwo = (a,b) -> a+b>=5;
		System.out.println(checkSumofTwo.test(5, 7));
		System.out.println(checkSumofTwo.test(1, 3));
		
		BiFunction<Integer,Integer,Integer> multiply = (a,b) -> a*b;
		System.out.println(multiply.apply(5, 6));
		
		BiConsumer<Integer,Integer> biConsumer = (i,j) -> System.out.println(i+i*j);
		biConsumer.accept(4, 5);
	}

}
