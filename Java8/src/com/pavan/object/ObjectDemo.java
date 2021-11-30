package com.pavan.object;

public class ObjectDemo {

	public static void main(String[] args) {
	
		ObjectDemo obj1 = new ObjectDemo();
		ObjectDemo obj2 = new ObjectDemo();
		
		obj1.equals(obj2); //  return (this == obj);
		
		String str1 = new String("Hi");
		String str2 = "Hi";
		
		str1.equals(str2); //content comparison
	}

}
