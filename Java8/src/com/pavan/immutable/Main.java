package com.pavan.immutable;

public class Main {

	public static void main(String[] args) {
		
		Address address = new Address("bay","ind");
		ImmutableDemo immutableDemo = new ImmutableDemo(1,"pavan", address);
		
		
		System.out.println(immutableDemo.toString());
		
		Address address1 = immutableDemo.getAddress();
		address1.setCity("hyd");
		
		System.out.println(immutableDemo.toString());
		
		//don't provide reference of Object member directly
		address.setCity("hyd");
		System.out.println(immutableDemo.toString());
		
		
		
	}

}
