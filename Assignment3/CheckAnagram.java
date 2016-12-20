/*
 * IS 147 
 * 
 * Unit #3 - Programming Assignment 
 * 
 * Zhengchao Yu 
 * 
 * November 14, 2015
 * 
 * Program Description: 
 * An anagram is a type of word play, the result of rearranging the letters
 * or a phrase to produce a new word or phrase, using all the original letters 
 * exactly once. Any word or phrase that exactly reproduces the letters in 
 * another order is an anagram. 
 */

import java.util.Scanner; 

public class CheckAnagram {
    
    /** Return true if the s1 and s2 are anagrams */
    public static boolean isAnagram(char[] s1, char[] s2) {
	if (s1.length == s2.length){
	    s1 = sort(s1);
	    s2 = sort(s2);
	    int count = 0; 
	    
	    for (int i = 0; i < s1.length; i++) { 
		if (s1[i] == s2[i]) { 
		    count++; 
		}
	    }
	    
	    if (count == s1.length) { 
		return true; 
	    }
	}
	return false; 
	
    }
    
    /** Return a sorted array of s */
    /** (i.e.) For the array, s = [c, d, a, f, g], **/
    /** this method should return [a, c, d, f, g] **/
    public static char[] sort(char[] s) {
	
	String str = new String(s);
	String lower = str.toLowerCase();
	
	// Selection Sort
	char [] t = lower.toCharArray();
	for (int i = 0; i < s.length; i++) { 
	    char currentMin = t[i]; 
	    int currentMinIndex = i; 
		
	    for (int j = i+1; j < t.length; j++ ) { 
		if (currentMin < t[j]) { 
		    currentMin = t[j];  
		    currentMinIndex = j; 
		}
	    }
	    
	    if (currentMinIndex != i) { 
		t[currentMinIndex] = t[i]; 
		t[i] = currentMin; 
	    }
	}
	return t; 
    }
    
    public static void main(String[] args) {
	    
	Scanner input = new Scanner(System.in); 
	
	// Prompt user to enter the first string
	System.out.println("Enter the first string: "); 
	String s1 = input.nextLine();
	
	// Prompt user to enter the second string
	System.out.println("Enter the second string: "); 
	String s2 = input.nextLine(); 
 	
	// Compare String 1 to String 2
	char [] charArray1 = s1.toCharArray();
	char [] charArray2 = s2.toCharArray();
	
	input.close();
	
	// If both strings are an anagram, print is s1 and s2 are anagram 
	if (isAnagram(charArray1, charArray2)) { 
	    System.out.println(s1 + " and " + s2 + " are anagram."); 
	}
	
	// If s1 and s2 are not anagram, print s1 and s2 are not anagram. 
	else {
	    System.out.println(s1 + " and " + s2 + " are not anagram");
	}
	
	
    }
    
}
