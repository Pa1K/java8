package com.pavan.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		
		
		List<Integer> arrayList = new ArrayList<>();
		
		// add element
		arrayList.add(1);
		arrayList.add(1, 4);
		arrayList.add(1, 3);
		
		//arrayList.add("Hi");
		//arrayList.add(true);
		//arrayList.add('a');
		arrayList.add(4);
		
		arrayList.forEach(System.out::println);
		System.out.println("   ");
		
		// updating value
		arrayList.set(3, 5);
		arrayList.forEach(System.out::println);
		System.out.println("   ");
		
		//getting value
		System.out.println(arrayList.get(2));
		System.out.println("   ");
		
		
		
		arrayList.remove(1);
		arrayList.forEach(System.out::println);
		System.out.println("   ");
		
		arrayList.remove(new Integer(1));
		arrayList.forEach(System.out::println);
		System.out.println("   ");
		
		arrayList.removeIf(e -> e==5);
		arrayList.forEach(System.out::println);
		System.out.println("   ");
		
		
		List list = new ArrayList();
		
		Collection<String> list2 = new ArrayList<>();
		list2.add("Hi");
		//list2.add(1);
		//list2.add('c');
		list2.add("Hello");
		
		List<Integer> list3 = new ArrayList<>();
		list3.add(1);
		//list3.add("2");
		//list3.add(true);
		list3.add(4);
		
		list.add(1);
		list.add("hi");
		list.add(1, true);
		
		list.addAll(list2);
		
		list.addAll(3, list3);
		
		list.add('c');
		
		list.forEach(i -> System.out.println(i));

	}

}
