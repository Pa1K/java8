package com.pavan.inheritance;

import com.pavan.immutable.ImmutableDemo;
import com.pavan.immutable.ImmutableDemo; // The import com.pavan.immutable.ImmutableDemo is never used

public class Main {

	public static void main(String[] args) {
		
		//child object can have reference of both parent and it's class
		// Parent class should have it's own reference, with child refernce gives error
		
		Parent parent = new Child();
		parent.add(1, 2); // when child method overrides parent method, child method is preferred
		parent.sub(1, 2); // if child doesn't have method  it inherits from parent
		parent.divide(1, 2);
		parent.multiply(1, 2);
		

		
		System.out.println("========");
		
		Child child = new Child();
		child.add(2, 3);
		child.sub(2, 3);
		child.divide(2, 3);
		child.multiply(2, 3);
	
		
		//Child child2 = new Parent(); // Type mismatch: cannot convert from Parent to Child
		//Child child2 = (Child) new Parent(); // casting is done 
		//Exception in thread "main" java.lang.ClassCastException: class com.pavan.inheritance.Parent cannot be cast to class com.pavan.inheritance.Child (com.pavan.inheritance.Parent and com.pavan.inheritance.Child are in unnamed module of loader 'app')

		//child2.add(3, 4);
		//child2.sub(3, 4);
		
		//https://www.javatpoint.com/exception-handling-with-method-overriding
		
		
		Parent p = new Parent();
		//p.privateMethod(); //private methods are not accessible out side of a class
		
		
		ImmutableDemo id = new ImmutableDemo(0, null, null);
		ImmutableDemo id2 = new ImmutableDemo(0, null, null);
	}

}
