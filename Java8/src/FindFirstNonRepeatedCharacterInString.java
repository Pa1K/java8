import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FindFirstNonRepeatedCharacterInString {

	public static void main(String[] args) {
		
		//String str = "pavan";
		String str = "teeteri";
		
		//count occurance of all characters in a string
		//based on count give first non occurance
		
		Map<Character,Integer> hm = new LinkedHashMap<>(); 
		
		for(char ch: str.toCharArray()) {
			if(!hm.containsKey(ch))
					hm.put(ch, 1);
			else
				hm.put(ch, hm.get(ch)+1);
		}
		
		int count=0; 
		for (Map.Entry<Character,Integer> entry : hm.entrySet()) {
			if(entry.getValue()==1) {
				count++;
				if(count==2) {
					System.out.println(entry.getKey());
					break;
				}
				
			}
				
		}
            	
		//2
		for(char ch: str.toCharArray()) {
			if(str.indexOf(ch) == str.lastIndexOf(ch)) {
				System.out.println("first non-repeating character is "+ch);
				break;
			}
				
		}
		
		//3
		System.out.println(hm.entrySet().stream().filter(e -> e.getValue()==1).skip(1).findFirst().get().getKey());
		System.out.println(hm.entrySet().stream().filter(e -> e.getValue()==1).findFirst().get().getKey());
		

	}

}
