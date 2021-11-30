package com.pavan.designpatterns;

public class FactoryPatternMainClass {

	public static void main(String[] args) {
		ProfessionFactory professionFactory = new ProfessionFactory();
		
		Profession doc = professionFactory.getProfession("doctor");
		doc.print();
		
		Profession other = professionFactory.getProfession("software engineer");
		System.out.println(other);
		
		Profession nullProf = professionFactory.getProfession(null);
		System.out.println(nullProf);
		
		System.out.println(null==null);
		System.out.println(other.equals(null));
	}

}
