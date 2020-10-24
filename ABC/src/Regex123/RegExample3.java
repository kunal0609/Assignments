package Regex123;

import java.util.regex.Pattern;

public class RegExample3 {
	
	/*
	 * Character class and Quantifiers(Occurance of character)
	 * X? - X occurs once or not at all
	 * X+ - X occurs once or more times
	 * X* - X occurs zero or more times
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("? quantifier ....");  
		System.out.println(Pattern.matches("[amn]?", "a")); 
		System.out.println(Pattern.matches("[amn]?", "aaa"));
		System.out.println(Pattern.matches("[amn]?", "kbj")); 
		 
		  
		System.out.println("+ quantifier ....");  
		System.out.println(Pattern.matches("[amn]+", "a"));  
		System.out.println(Pattern.matches("[amn]+", "aaa"));
		System.out.println(Pattern.matches("[amn]+", "aammmnn"));  
		System.out.println(Pattern.matches("[amn]+", "aazzta")); 
		  
		System.out.println("* quantifier ....");  
		System.out.println(Pattern.matches("[amn]*", "ammmna"));
	}

}
