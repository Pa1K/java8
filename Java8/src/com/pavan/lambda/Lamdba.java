package com.pavan.lambda;

import java.util.function.BiConsumer;

public class Lamdba implements FunctionalInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiConsumer<Integer,Integer> biConsumer = (a,b) -> System.out.println(a+b);
		biConsumer.accept(5, 6);
		
		FunctionalInterfaceDemo functionalInterfaceDemo = () -> System.out.println("hi,this is my custom functional interface");
		functionalInterfaceDemo.abstractMethod();
		
		Lamdba lamdba = new Lamdba();
		lamdba.abstractMethod();
		lamdba.print();
		
	}

	@Override
	public void abstractMethod() {
		System.out.println("this is abstract method");
		
	}
	
	

}
