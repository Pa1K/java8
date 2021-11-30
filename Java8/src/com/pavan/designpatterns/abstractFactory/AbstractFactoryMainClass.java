package com.pavan.designpatterns.abstractFactory;

public class AbstractFactoryMainClass {

	public static void main(String[] args) {
		
		//AbstractFactoryProducer abstractFactoryProducer = new AbstractFactoryProducer();
		
		AbstractFactory abstractFactory = AbstractFactoryProducer.getProfession(true);
		
		Profession eng = abstractFactory.getProfession("Engineer");
		eng.print();
		

	}

}
