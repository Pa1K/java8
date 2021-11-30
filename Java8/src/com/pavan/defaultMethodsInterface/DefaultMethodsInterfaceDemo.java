package com.pavan.defaultMethodsInterface;

public interface DefaultMethodsInterfaceDemo {

	void method1();
	
	default void defaultMethod() {
		System.out.println("this is default method: defaultMethod in interface: DefaultMethodsInterfaceDemo");
	}
	
	default void defaultMethod2() {
		System.out.println("this is default method: defaultMethod2 in interface: DefaultMethodsInterfaceDemo");
	}
	
	/**
	default int hashCode() {
		return 6;
	}
	//A default method cannot override a method from java.lang.Object 
	*/
	
	default void defaultMethod3() {
		System.out.println("this is default method: defaultMethod3 in interface: DefaultMethodsInterfaceDemo");
	}
}
