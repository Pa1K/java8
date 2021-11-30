package com.pavan.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateInterface {

	public static void main(String[] args) {
		
		Predicate<Integer> predicate = i -> i>4;
		System.out.println(predicate.test(5));
		
		System.out.println("-----------");
		
		Predicate<? super Integer> predicate2 = i -> i<5;
		System.out.println(predicate2.test(5));
		
		System.out.println("-----------");
		
		System.out.println(predicate.and(predicate2).test(5));
		System.out.println(predicate.or(predicate2).test(5));
		
		System.out.println("-----------");
		
		System.out.println(predicate2.negate().test(5));
		

	}

}
