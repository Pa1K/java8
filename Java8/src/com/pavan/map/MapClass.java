package com.pavan.map;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class MapClass {

	public static void main(String[] args) {
		
		//Map<Integer, String> map = new HashMap<>();
		Map<Integer, String> map = new ConcurrentHashMap<>();
		
		String s1 = map.put(1, "pavan");
		String s2 = map.put(1, "ram");
		String s3 = map.put(1, "sita");
		String s4 = map.put(1, "sita");
		String s5 = map.put(1, "sita");
		map.put(2, "arun");
		map.put(3, "ajay");
		
		Iterator<Integer> itr = map.keySet().iterator();
		while(itr.hasNext()) {
			Integer key = itr.next();
			System.out.println("map value :" + map.get(key));
			if(key.equals(2)) {
				map.put(4,"raju"); // Exception in thread "main" java.util.ConcurrentModificationException - as adding element increases size of map which structural change
			}
		}
		
		
		
		System.out.println(s1+" "+ s2 +" "+ s3 + " "+ s4 + " " + s5);
		map.forEach((k,v) -> System.out.println(k+","+v));
		
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Math.pow(2, 31));
		
	}

}
