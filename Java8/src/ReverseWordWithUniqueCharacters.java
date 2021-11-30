import java.util.LinkedHashSet;
import java.util.Set;

public class ReverseWordWithUniqueCharacters {
	
	//Duplicate method main(String[]) in type ReverseWordWithUniqueCharacters
	//main(String[] args) is main(String... args)
	/*
	 * public static void main(String... args) {
	 * 
	 * 
	 * 
	 * String str = "ttyhgggggcccnnnhnn uuttiii"; String[] words = str.split(" ");
	 * 
	 * for(String word: words){
	 * 
	 * Set<Character> set = new LinkedHashSet<>();
	 * 
	 * for(int i=word.length()-1;i>0;i--){
	 * 
	 * //set.add(new Character(word.charAt(i))); set.add(word.charAt(i));
	 * 
	 * }
	 * 
	 * set.stream().forEach(System.out::print);
	 * 
	 * System.out.print(" "); }
	 * 
	 * }
	 */
	
	
	
	
	public static void main(String[] args) {
		
		
	     
	     String str = "ttyhgggggcccnnnhnn uuttiii"; 
	     String[] words = str.split(" ");
	    
	    for(String word: words){
	        
	        Set<Character> set = new LinkedHashSet<>();

	        for(int i=word.length()-1;i>0;i--){
	            
	            //set.add(new Character(word.charAt(i)));
	        	set.add(word.charAt(i));
	            
	        }
	        
	        set.stream().forEach(System.out::print);
	        
	        System.out.print(" ");
	}

	}

}
