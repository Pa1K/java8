package com.pavan.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4);
		
		list.stream().forEach(System.out::println);
		
		Integer[][] arr = {{1,2},{2,3}};
		
		List<Integer[]> list2 = Arrays.asList(arr);
		
		
		
		  String[][] array = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};
		 // array to a stream
		  Stream<String[]> stream1 = Arrays.stream(array);
		  
		  // same result
		  Stream<String[]> stream2 = Stream.of(array);
		  
		  stream1.forEach(System.out::println);
		  stream2.forEach(System.out::println);
		  
		  
		 Stream.of(array)  // Stream<String[]>
		          .flatMap(Stream::of)        // Stream<String>
		          .forEach(System.out::print);   // [a, b, c, d, e, f]
		 
		 System.out.println();
		 
		 Integer[][] intarr = new Integer[][] {{1,3},{1,4},{2,3},{2,4}};
		 Stream.of(intarr).flatMap(Stream::of).forEach(System.out::print);
		 
		 List<Integer> numbers1 = Arrays.asList(1, 2, 3); 
		 List<Integer> numbers2 = Arrays.asList(3,4);
		 //[(1, 3), (1, 4), (2, 3), (2, 4), (3, 3), (3, 4)]


		List<Integer[]> arrList = numbers1.stream().flatMap( i -> numbers2.stream().map(j -> new Integer[]{i, j}) ).collect(Collectors.toList());
		
		System.out.println();
		arrList.forEach(e -> System.out.println(e[0]+","+e[1]));
		 
	}

}

/**
Stream<String[]>      -> flatMap ->	Stream<String>
Stream<Set<String>>   -> flatMap ->	Stream<String>
Stream<List<String>>  -> flatMap ->	Stream<String>
Stream<List<Object>>  -> flatMap ->	Stream<Object>

https://mkyong.com/java8/java-8-flatmap-example/
*/