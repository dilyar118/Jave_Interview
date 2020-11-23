package Frequency_Of_Characters_String;

public class Solution05 {
	
	public static String frequencyOfChar(String str) {
		
		String sb = "";
		
		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {
			count++;
			
			if(i+1 == str.length() || str.charAt(i) != str.charAt(i+1)) {
				
				sb += str.charAt(i);
				sb += count+ "";
				
				count = 0;
				
			}
		}
		
		return sb ;
	}
	
	public static void main(String[] args) {
		
		System.out.println(frequencyOfChar("aaaabbbcccaaa"));
	}

}
