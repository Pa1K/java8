package com.pavan.interviewQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsQ {

	public static void main(String[] args) {
		
		//find duplicate elements in a given list 
		List<Integer> list = Arrays.asList(10,20,20,30,30,30,40,40);
		Set<Integer> set = new HashSet<>();
		list.stream().filter(i -> !set.add(i)).collect(Collectors.toSet()).forEach(System.out::println);
		
		
		//write a program to multiply 2nos using Functional interface
		BiConsumer<Integer,Integer> biConsumer = (i,j) -> System.out.println(i*j) ;
		biConsumer.accept(5, 6);
		
		
		}

}
