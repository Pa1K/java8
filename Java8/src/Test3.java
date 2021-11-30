import java.io.BufferedInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class Test3 {
	
	
	interface one{
		int operation(int a, int b);
	}
	
	private int operate(int a, int b, one t) {
		return t.operation(a,b);
	}
	
	

	public static void main(String[] args) {
		
		// no need to import java.lang explicitly
		Integer i = 1;
		System.out.println(i);
		System.out.println(Math.abs(-1));
		System.out.println(Math.min(11,10));
		
		String str = "Hi";
		StringBuilder str2 = new StringBuilder();
		
		
		// need to import java.lang explicitly
		InputStream is = null;
		BufferedInputStream bis = new BufferedInputStream(is);
		
		File file;
		
		PrintStream ps;
		
		// need to import java.util explicitly
		ArrayList al;
		
		Arrays arr;
		
		HashMap<String,Integer> hm;
		
		
		
		String s1= new String("Hello");
		String s2 = new String("there");
		String s3 = new String();
		
		s3 = s1+s2;
		System.out.println(s3);
		
		/*
		 * String s4 = s1-s2; System.out.println(s4);
		 * 
		 * String s5 = s1&s2; System.out.println(s5);
		 * 
		 * String s6 = s1&&s2; System.out.println(s6);
		 */
		
		
		one div = (int x, int y) -> x/y;
		Test3 obj = new Test3();
		System.out.println("dividend is "+obj.operate(6, 3, div));
		ArrayList<Integer> arrL = new ArrayList<>();
		arrL.add(1);
		arrL.add(2);
		arrL.add(3);
		arrL.add(4);
		arrL.add(5);
		arrL.add(6);
		arrL.forEach(j -> { if(j%2==1) System.out.println(j);});
		
	}

}

/**
 * java.lang Provides classes that are fundamental to the design of the Java programming language.
 	java.io  Provides for system input and output through data streams, serialization and the file system.
 */
/**
JVM internally resolve this problem by importing java.lang package by default.
*/