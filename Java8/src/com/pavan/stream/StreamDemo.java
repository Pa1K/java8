package com.pavan.stream;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		System.out.println("list.forEach(i -> System.out.println(i));");
		list.forEach(i -> System.out.println(i));
		System.out.println();
		
		//filter and forEach
		System.out.println("list.stream().filter(i -> i>2).forEach(System.out::println);");
		list.stream().filter(i -> i>2).forEach(System.out::println);
		System.out.println();
		
		//filter and count
		System.out.println("list.stream().filter(i -> i%2==0).count()");
		System.out.println(list.stream().filter(i -> i%2==0).count());
		System.out.println();
		
		//map 
		System.out.println("list.stream().map(i -> { if(i%2==0) return i/2; else  return i*2;}).forEach(System.out::println);");
		list.stream().map(i -> { if(i%2==0) return i/2; else  return i*2;}).forEach(System.out::println);
		System.out.println();
		
		//map and collect
		System.out.println("List<Integer> list2 = list.stream().map(i -> { if(i%2==0) return i/2; else  return i*2;}).collect(Collectors.toList())");
		List<Integer> list2 = list.stream().map(i -> { if(i%2==0) return i/2; else  return i*2;}).collect(Collectors.toList());
		list2.forEach(System.out::println);
		System.out.println();
		
		//sorted
		System.out.println("list2.stream().sorted().forEach(System.out::println)");
		list2.stream().sorted().forEach(System.out::println);
		System.out.println();
		
		
		//sorted and compareTo
		System.out.println("list2.stream().sorted((i1,i2)->i2.compareTo(i1)).forEach(System.out::println)");
		list2.stream().sorted((i1,i2)->i2.compareTo(i1)).forEach(System.out::println);
		System.out.println();
		
		//max 
		System.out.println("list2.stream().max((i1,i2)->i1.compareTo(i2)).get()");
		System.out.println(list2.stream().max((i1,i2)->i1.compareTo(i2)).get());
		
		System.out.println("list2.stream().max((i1,i2)->i2.compareTo(i1)).get()");
		System.out.println(list2.stream().max((i1,i2)->i2.compareTo(i1)).get());
		
		System.out.println("list2.stream().min((i1,i2)->i1.compareTo(i2)).get()");
		System.out.println(list2.stream().min((i1,i2)->i1.compareTo(i2)).get());
		System.out.println();
		
		
		Object[] array = list2.stream().sorted((i1,i2)->i2.compareTo(i1)).toArray();
		for(Object i:array) { System.out.println(i);}
		System.out.println();
		
		//Integer[] array1= (Integer[]) list2.stream().sorted((i1,i2)->i2.compareTo(i1)).toArray(); 
		/**
		 * Exception in thread "main" java.lang.ClassCastException: class [Ljava.lang.Object; cannot be cast to class [Ljava.lang.Integer; 
		 * ([Ljava.lang.Object; and [Ljava.lang.Integer; are in module java.base of loader 'bootstrap')
		 */

		//for(Integer i:array1) { System.out.println(i);}
		
		Stream<Serializable> streamCreated = Stream.of(1,"pavan",2,"kari",'h','i',true);
		streamCreated.forEach(System.out::println);
		System.out.println();
		
		//limit
		System.out.println("list.stream().limit(2).forEach(System.out::println);");
		list.stream().limit(2).forEach(System.out::println);
		System.out.println();
		
		//skip
		list.stream().skip(4).forEach(System.out::println);
		System.out.println();
		
		//peek
		list.stream().peek(System.out::println).filter(i -> i>4).forEach(System.out::println);
		System.out.println();
		
		//reduce
		BinaryOperator<Integer> accumulator = (a,b) -> a+b;
		System.out.println(list.stream().reduce(accumulator).get());
		System.out.println();
		
		BinaryOperator<Integer> accumulator2 = (a,b) -> b-a;
		System.out.println(list.stream().reduce(accumulator2).get());
		System.out.println();	
		
		BinaryOperator<Integer> accumulator3 = (a,b) -> a*b;
		System.out.println(list.stream().reduce(accumulator3).get());
		System.out.println();
		
		
		//map() vs flatMap()
		Integer[] array1 = {1,2,3,4,5};
		//System.out.println(array1); // address getting printed
		//List<Integer> integerList = Arrays.asList(1,2,3,4,5);
		List<Integer> integerList = Arrays.asList(array1);
		//System.out.println(integerList);
		
		
		List<List<Integer>> integerList2 = Stream.of(Arrays.asList(1,2,3,4,5)).collect(Collectors.toList());
		integerList2.forEach(System.out::println);
		
		List<List<Integer>> integerList3 = integerList2.stream().map(e -> e).collect(Collectors.toList());
		integerList3.forEach(System.out::println);
		
		
		List<Integer> integerList4 =  integerList2.stream().flatMap(e -> e.stream()).collect(Collectors.toList());
		integerList4.forEach(System.out::println);
		
		//List<Integer> integerList5 = integerList2.stream().map(e -> e).map(i -> i).collect(Collectors.toList());
		//integerList5.forEach(System.out::println);
		//can't we chain multiple maps together
		/** 
		 * https://mkyong.com/java8/java-8-flatmap-example/#what-is-flatmap
		 */
		
		
		System.out.println();
		
		
		List<Integer> list3 = Arrays.asList(5, 3, 4, 1, 3, 7, 2, 9, 9, 4, 9);
		
		
		System.out.println("list3 "+list3);
		System.out.println("list3.stream().max((v1,v2) -> v1-v2).get() " + list3.stream().max((v1,v2) -> v1-v2).get());
		
	
		System.out.println("Collections.frequency(list3, 9)" + Collections.frequency(list3, 9));
		
		Map<Integer, Long> counts =
				list3.stream().collect(Collectors.groupingBy(e -> e,Collectors.counting()));
		
		
		 List<Integer> listNumbers = Arrays.asList(1,2,3,4,3,4,5,6,7,3,4,5,2,3,4,5,6,7,8,9);
		 listNumbers.stream().collect(Collectors.groupingBy(e-> e,Collectors.counting())).entrySet().stream().filter(e -> e.getValue()>1).forEach(e -> System.out.println(e));
		
		System.out.println("list3.stream().count() " + list3.stream().count());
		System.out.println("list3.stream().collect(Collectors.counting()) " + list3.stream().collect(Collectors.counting()));
		System.out.println("list3.stream().collect(Collectors.groupingBy(e -> e,Collectors.counting())) " 
						+ list3.stream().collect(Collectors.groupingBy(e -> e,Collectors.counting())));
	
		//find common elements b.w two lists
		Integer[] arr1 = {1,2,3,4,5};
		Integer[] arr2 = {5,6,7,8,9};
		
		List<Integer> arrList1 = new ArrayList(Arrays.asList(arr1));
		List<Integer> arrList2 = new ArrayList(Arrays.asList(arr2));
		
		arrList1.stream().filter(arrList2::contains).forEach(System.out::println);
		
		
		
		
	}

}
