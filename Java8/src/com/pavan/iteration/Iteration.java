package com.pavan.iteration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Iteration {

	public static void main(String[] args) {
		
		//list
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		//set
		Set<String> set = new HashSet<>();
		set.add("pavan");
		set.add("bhavani");
		set.add("kari");
		
		Iterator<String> itr2 = set.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		//map
		Map<String,String> map = new HashMap<>();
		map.put("Key_2","value_2");
		map.put("Key_4","value_4");
		map.put("Key_3","value_3");
		map.put("Key_1","value_1");
		map.put("FB", "hash1");
		map.put("Ea", "hash2");
		
		Iterator<String> itr3 = map.keySet().iterator();
		while(itr3.hasNext()) {
			String key = itr3.next();
			System.out.println(key+map.get(key));
		}
		
	}

}
