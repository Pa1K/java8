import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagram {

	public static void main(String[] args) {
		
		String str = "HihI";
		Map<String,Integer> map = new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			
			if(map.containsKey(str.charAt(i))) {
				map.put(String.valueOf(str.charAt(i)), map.get(str.charAt(i))+1);
			}
			else
				map.put(String.valueOf(str.charAt(i)), 1);
		}
		
		Stream.of(map).forEach(System.out::println); //{H=1, h=1, i=1, I=1}
	
		
				Stream.of(str).collect(Collectors.groupingBy(e -> e,Collectors.counting())).forEach((k,v) -> System.out.println(k+" "+v));; //HihI 1
		
		
		

	}

}
