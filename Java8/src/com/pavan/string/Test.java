package com.pavan.string;

import java.util.Arrays;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		List<String> listName = Arrays.asList("pavan","pavan","ram","ram","sachin","pavan");
		//Set<String> hset = new HashSet<>();
		Map<String,Integer> hmap = new HashMap<>();
		
		/*
		 * listName.stream().map(n -> {if (hmap.containsKey(n) hmap.put(n,hmap.get(n));
		 * else hmap.put(n, 0); )}).
		 */
		//listName.stream().filter(n -> !hset.add(n)).forEach(System.out.println);
		listName.stream().forEach(n -> {if(hmap.containsKey(n)) 
											hmap.put(n,hmap.get(n)+1);
											else 
											hmap.put(n,1);});
		//hmap.keySet().stream().filter(n-> n>1).forEach(System.out.println());
		
		
		
		//String vs StringBuilder vs StringBuffer
		System.out.println("String vs StringBuilder vs StringBuffer");
		
		String str = "amit";
		str.concat("kumar"); // when will this object is destoryed
		System.out.println(str);
		
		System.out.println(20+10+"hi");
		System.out.println("hi"+10+20);
		System.out.println("hi"+(10+20));
		
		//String Object Creation vs String literal
		String name1 = "pavan";
		String name2 = name1.concat("");
		
		String name3 = new String("pavan");
		System.out.println(name3.hashCode() + name3);
		
		String name4 = "pavan";
		System.out.println(name4.hashCode() + name4);
		
		System.out.println(name1 == name2); //true
		System.out.println(name1 == name3); //false
		System.out.println(name1 == name3.intern()); //true
		System.out.println(name1 == name4); //true
		
		System.out.println(name2 == name3); //false
		System.out.println(name2 == name4); //true
		
		System.out.println(name3 == name4); //false
		
		
		String name5 = "bhavan";
		String name6 = name5.concat("i");
		
		System.out.println("name5 concat i :" + name5.concat("i"));
		System.out.println("name6 is "+ name6);
		System.out.println("name5 concat i :" + name5.concat("i"));
		
		
		Object o = new String("Pavan");
		System.out.println(((String) o).concat("hi")); // The method concat(String) is undefined for the type Object , add cast to o
		
		String name7 = new String("bhavani");
		
		String name8 = "bhavani";
		
		System.out.println(name5 == name6); //false
		System.out.println(name5 == name7); //false
		System.out.println(name5 == name7.intern()); //false
		System.out.println(name5 == name8); //false
		
		System.out.println("name6: "+name6+" , "+"name7: "+name7 + (name6 == name7)); //false
		System.out.println("name6: "+name6+" , "+"name8: "+name8 + (name6 == name8)); //false
		
		System.out.println("name7: "+name7+" , "+"name8: "+name8 + (name7 == name8)); //false
		
		
		
		
	}

}
