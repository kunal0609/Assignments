package Regex123;

import java.util.regex.Pattern;

public class RegExample2 {

	//character class example - character matching is performed here
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Pattern.matches("[amn]", "abcd"));//false (not a or m or n)  
		System.out.println(Pattern.matches("[amn]", "a"));//true (among a or m or n)  
		System.out.println(Pattern.matches("[amn]", "ammmna"));//false (m and a comes more than once)  
		
	}

}
