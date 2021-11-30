package com.pavan.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SubStringOccurance {

	public static void main(String[] args) {
		
		 String text = "AABCCAAAADCBBAADBBC";
		 String str = "AA";
		 
		 
		 int count = countMatches(text, str);
		 System.out.println(count);
		 
		 int count2 = countMatches2(text, str);
		 System.out.println(count2);

	}
	
	/* Counts how many times the substring appears in the larger string. */
    public static int countMatches(String text, String str)
    {
        if (isEmpty(text) || isEmpty(str)) {
            return 0;
        }
 
        int index = 0, count = 0;
        while (true)
        {
            index = text.indexOf(str, index);
            if (index != -1)
            {
                count ++;
                index += str.length();
            }
            else {
                break;
            }
        }
 
        return count;
    }
    
    /* Counts how many times the substring appears in the larger string. */
    public static int countMatches2(String text, String str)
    {
        if (isEmpty(text) || isEmpty(str)) {
            return 0;
        }
 
        Matcher matcher = Pattern.compile(str).matcher(text);
 
        int count = 0;
        while (matcher.find()) {
            count++;
        }
 
        return count;
    }
 
    
    /* Checks if a string is empty ("") or null. */
    public static boolean isEmpty(String s) {
        return s == null || s.length() == 0;
    }

}
