package com.pavan.staticMethodInterface;

public interface StaticMethodInterface2 {
	
	 static void staticMethod() {
		System.out.println("staticMethod in StaticMethodInterface");
	} //Illegal combination of modifiers for the interface method staticMethod; only one of abstract, default, or static permitted
}
