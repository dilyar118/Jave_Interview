package Frequency_Of_Characters_String;

import java.util.ArrayList;

public class practice01 {
	
	public static String frequencyOfCharacters( String str) {
		
		String removeDup = "";
		
		for( int i = 0; i < str.length(); i++) {
			
			if( !removeDup.contains("" + str.charAt(i))) {
				
				removeDup = removeDup + str.charAt(i);
				
			}
		}
		
		String result = "";
		
		for(int i = 0; i < removeDup.length(); i++) {
			
			int count = 0;
			
			for(int j = 0; j < str.length(); j++) {
				
				if( removeDup.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			result = result + removeDup.charAt(i) + count;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		System.out.println(frequencyOfCharacters("AAABBC"));
		
		
		
	}
	
	

}
