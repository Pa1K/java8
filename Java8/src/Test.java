import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	
	static final Integer i1 = 1;
	final Integer i2 =2 ;
	Integer i3 = 3;
	
	
	public static void main(String[] args) {
		
		System.out.println("main method");
		final Integer i4 = 4;
		Integer i5 = 5;
		
		class Inner {
			final Integer i6 = 6;
			Integer i7 = 7;
			
			Inner(){
				System.out.println(i6+i7);
			}
			
			
		
		}
		
		//Inner inner = new Inner(); // gives 13
		
		Thread t = Thread.currentThread();
		System.out.println(t.getPriority());
		
	}
	

}
