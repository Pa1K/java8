package com.pavan.functionalInterfaces;

import java.util.function.Consumer;

public class ConsumerInterfaceDemo {

	public static void main(String[] args) {
		
		ConsumerInterfaceDemo consumerInterfaceDemo = new ConsumerInterfaceDemo();
		consumerInterfaceDemo.square(5);
		
		Consumer<Integer> consumerInterface = i -> System.out.println(i*i);
		consumerInterface.accept(6);
		
		Consumer<Integer> consumerInterface2 = i -> System.out.println(i*2);
		consumerInterface2.accept(7);
		
		consumerInterface.andThen(consumerInterface2).accept(8);
		consumerInterface2.andThen(consumerInterface).accept(9);
		
		
	}

	private void square(int i) {
		System.out.println(i*i);
		
	}

}
