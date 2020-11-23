package Frequency_Of_Characters_String;

import java.util.HashMap;
import java.util.Map;

public class practice {
	
	

	public static String frequencyOfCharacters(String str) {
		
		String removeDuplicate = "";
		
		for(int i = 0; i < str.length(); i++) {
			
			if(!removeDuplicate.contains("" + str.charAt(i))) {
				
				removeDuplicate = removeDuplicate + "" + str.charAt(i);
				
			}
		}
		
		String result = "";
		
		for(int k = 0; k < removeDuplicate.length(); k++) {
			
			int count = 0;
			
			for(int j = 0; j < str.length(); j++) {
				
				if(removeDuplicate.charAt(k) == str.charAt(j)) {
					count++;
					
					
				}	
				}
				
				result = result + removeDuplicate.charAt(k)  + count;
			
			
			
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		System.out.println(frequencyOfCharacters("aaaabbbcc"));
		
		System.out.println("=======================================================================");
		
		
		String str = "AAAGGD";
		
		Map<Character, Integer> frequency = new HashMap<>();
		
		for(int i = 0; i < str.length(); i++) {
			
			if(frequency.containsKey(str.charAt(i))) {
			frequency.put(str.charAt(i), frequency.get(str.charAt(i))+1);
			
			
		}else{
			
		
			frequency.put(str.charAt(i), 1);
		}

		}
		
		System.out.println(frequency.toString().replace("{", "").replace("}", "").replace("=", "").replace(","," "));
		
		
	}

}
