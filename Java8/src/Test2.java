import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** Deloitte Ada test
 * */
public class Test2 {
	
	//static String month = "february";
	
	public static class parent {
		/*
		 * static void print() { System.out.println("print in parent"); }
		 */
		 
		 void print() {
				System.out.println("print in parent");
			}
	}
	
	public static class child extends parent{
		
		/*
		 * static void print() { System.out.println("print in child"); }
		 */
		
		void print() {
			System.out.println("print in child");
		}
	}
	
	
	public static Integer divide(int x, int y) {
			try {
				return x/y;
			}
			finally {
				System.out.println("finally");
			}
	
	}
	
	
	public static class MusicFestival {
		public int price;
	}
	
	public static void changeString(String month) {
		month = "january";
		System.out.println("month in changeString is "+month);
	}
	
	public static void changeArray(String[] holidays) {
		holidays[1]="5";
	}
	
	public static void changeObject(MusicFestival festival) {
		festival.price = 32;
	}
	
	public static void main(String[] args) {
		
		
		try {
			throwerMethod();
			System.out.println("I");
		}catch(RuntimeException e) {
			System.out.println("J");
		}catch(Exception e1) {
			System.out.println("K");
		}finally {
			System.out.println("L");
		}
		System.out.println("M");
		
		
		Map<String,String> dataStructures = new HashMap<String, String>();
		dataStructures.put(new String("[]"), "array1");
		dataStructures.put(new String("[]"), "array2");
		System.out.println(dataStructures);
		
		
		List<String> listA = new ArrayList<>();
		listA.add("A");
		
		List<String> listB = listA;
		List<String> listC = new ArrayList<>(listB);
		
		listA.clear();
		listB.add("B");
		listC.add("C");
		
		System.out.println(listA);
		System.out.println(listB);
		System.out.println(listC);
		
		
		parent A = new parent();
		parent B = new child();
		A.print();
		B.print();
		
		
		try {
			System.out.println(divide(2,0));
		}catch(Exception e) {
			System.out.println("Divisible by 0!");
		}
		
		
		String month = "february";
		changeString(month);
		System.out.println("The month is "+month);
		month="march";
		System.out.println("The month is after assigning march is "+month);
		
		String month2 = new String("april");
		changeString(month2);
		System.out.println("The month is "+month2);
		month2="may";
		System.out.println("The month is after assigning may is "+month2);
		
		String[] holidays = new String[] {"1","2"};
		changeArray(holidays);
		System.out.println("The holidays are on "+holidays[0]+" and "+holidays[1]);
		
		MusicFestival festival = new MusicFestival();
		festival.price = 40;
		changeObject(festival);
		System.out.println("The festival ticket price is "+ festival.price+"$");
		
	}

	

	private static void throwerMethod() {
		throw new RuntimeException();
		
	}
}
