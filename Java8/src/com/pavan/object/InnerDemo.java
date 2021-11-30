package com.pavan.object;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;

import com.pavan.object.Outer.Inner;


class Outer {
	
	//static private int a;
	
	private int a;
	
	/*
	 * Outer(int a){ this.a = a; }
	 */
	public void show() {
		System.out.println("show");
	}
	
	 class Inner {
		
		private int b;
		
		Inner(int b){
			this.b =b;
		}
	
		public void display() {
			System.out.println("display");
		}

		@Override
		public String toString() {
			return "Inner [b=" + b + "]";
		}
		
		
	}
	
	
	
}
public class InnerDemo {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		//Outer obj = new Outer(5);
		Outer obj = new Outer();
		obj.show();
		
		
		//System.out.println(Outer.a);
		//System.out.println(obj.a);
		
		
		//Field[] fields = obj.getClass().getDeclaredFields();
		Field field = obj.getClass().getDeclaredField("a");
		field.setAccessible(true);
		System.out.println(field.get(obj));
		
		/*
		 * for(Field field2 : fields) { System.out.println(field2.toString()); }
		 */
		
		
		Outer.Inner obj2 =obj.new Inner(4);
		obj2.display();
		
		/*
		 * Outer.Inner obj2 =new Outer.Inner(4); obj2.display();
		 */
		
		Field innerField = obj2.getClass().getDeclaredField("b");
		innerField.setAccessible(true);
		System.out.println(innerField.get(obj2));
		
		
		List<Inner> innerObjList = new ArrayList<>();
		innerObjList.add(obj2);
		
		System.out.println(innerObjList);
		
		
	}

}
