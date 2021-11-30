import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		/**
		 * Class2 class2 = new Class2(); class2.display('a'); // we can pass single
		 * character to as int argument class2.display("String");
		 */

		/**
		 * SecondClass secondClass = new SecondClass(); secondClass.add(3,"Three");
		 * secondClass.add(2, 2); secondClass.add(1, "One"); secondClass.add(6, 6);
		 * secondClass.display();
		 */

		/**
		 * List<String> myList = new ArrayList<String>(); myList.add("1");
		 * myList.add("2"); myList.add("3"); myList.add("4");
		 * 
		 * Iterator<String> itr = myList.iterator(); while(itr.hasNext()) { String value
		 * = itr.next(); System.out.print(" "+value); if(value.equals("2")) {
		 * myList.remove(value); //Exception in thread "main"
		 * java.util.ConcurrentModificationException } }
		 */

		/**
		 * MainClass mainClass1 = new MainClass(); mainClass1.showPlan();
		 * 
		 * MainClass mainClass2 = new MainClass(); mainClass2.setPlan("Plan B");
		 * 
		 * mainClass1.showPlan();
		 */

		/**
		 * getWork(HackerEarth.obj);
		 */

		/*
		 * String[][] data = { {}, {"Present"} };
		 * 
		 * String str1 = Arrays.stream(data).flatMap(d ->
		 * Arrays.stream(d)).findAny().orElse("Nothing!");
		 * 
		 * // Cannot invoke stream() on the array type String[][]
		 *//**
			 * String str2 = data.stream().flatMap(d ->
			 * Arrays.stream(d)).findAny().orElse("Nothing!");
			 *//*
				 * 
				 * String str3 = Arrays.stream(data).flatMap(d ->
				 * Arrays.stream(d)).findFirst().orElse("Nothing!");
				 * 
				 * System.out.println(str1 + str3);
				 */
		
		/**
		try {
			URL obj1 = new URL("https://google.com");
			URLConnection obj2 = obj1.openConnection();
			System.out.println(obj2.getContentType());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		Scanner sc = new Scanner(System.in);
	    
	    int b = sc.nextInt();
	    int h = sc.nextInt();
	    
	    try{
	        if(b<=0 || h<=0)
	            throw new Exception("Bread and height must be positive");
	        else
	            System.out.println(b*h);
	    }catch(Exception e){
	        System.out.println(e);
	    }
	    
	    
	    /** 
	     * date given find what day it is*/
		/*
		 * Date date = new Date(2021, 9, 1); int i = date.getDay(); switch(i) { case 1:
		 * System.out.println("SUNDAY"); break; case 2: System.out.println("MONDAY");
		 * break; case 3: System.out.println("TUESDAY"); break; case 4:
		 * System.out.println("WEDNESDAY"); break; case 5:
		 * System.out.println("THURSDAY"); break; case 6: System.out.println("FRIDAY");
		 * break; case 7: System.out.println("SATURDAY"); break;
		 * 
		 * }
		 * 
		 * 
		 * LocalDate dt = LocalDate.of(2021, 10, 1);
		 * System.out.print(dt.getDayOfWeek().toString());
		 */
		

	}

	/**
	 * class Class1 { public void display(int i) {
	 * 
	 * //System.out.println("Its an integer"); System.out.println(i); }
	 * 
	 * } class Class2 extends Class1{
	 * 
	 * 
	 * public void display(String i) {
	 * 
	 * //System.out.println("Its a String"); System.out.println(i); } }
	 **/

	/**
	 * class FirstClass{ HashMap<Integer,Object> hashMap = new
	 * HashMap<Integer,Object>();
	 * 
	 * public void add(int key, Integer value) { hashMap.put(key, value); } }
	 * 
	 * class SecondClass extends FirstClass{ public void add(int key, String value)
	 * { hashMap.put(key, value); }
	 * 
	 * public void display() { Integer[] result = new Integer[hashMap.size()];
	 * hashMap.keySet().toArray(result); for(int i: result){ System.out.println(i +
	 * " " +hashMap.get(i)); System.out.println(hashMap.get(i%2));
	 * System.out.println("======"); }
	 * 
	 * }
	 * 
	 * }
	 */
	/**
	 * static Plan plan;
	 * 
	 * class Plan {
	 * 
	 * private String planType; private Date expireDate; private int tenure;
	 * 
	 * public Plan() { this.expireDate = new Date(2999,12,12); this.planType = "Plan
	 * A"; this.tenure = 24; } }
	 * 
	 * public void setPlan(String planType) { this.plan.planType = planType; }
	 * 
	 * MainClass(){ if(this.plan == null) this.plan = new Plan(); }
	 * 
	 * public void showPlan() { System.out.println(plan.planType); }
	 */

	/**
	 * public static void getWork(HackerEarth obj) { obj.work(); }
	 */
	
}

/**
 * interface HackerEarth {
 * 
 * public void work();
 * 
 * 
 * HackerEarth obj = new NoWork();
 * 
 * class NoWork implements HackerEarth {
 * 
 * @Override public void work() { System.out.println("Code in Java"); }
 * 
 *           private NoWork() { System.out.println("No Coding in Java"); } } }
 */
