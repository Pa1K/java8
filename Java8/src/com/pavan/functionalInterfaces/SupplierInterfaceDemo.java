package com.pavan.functionalInterfaces;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierInterfaceDemo {

	public static void main(String[] args) {
		
		SupplierInterfaceDemo supplierInterfaceDemo = new SupplierInterfaceDemo();
		System.out.println(supplierInterfaceDemo.fetchCurrentDate());
		
		Supplier<Date> supplier = () -> new Date();
		System.out.println(supplier.get());

	}

	private Date fetchCurrentDate() {
		
		return new Date();
	}

}
