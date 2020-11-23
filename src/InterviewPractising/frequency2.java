package InterviewPractising;

import java.util.*;

public class frequency2 {
	
	
	public static void frequency (String str) {
		
		Map< Character, Integer> table = new HashMap<>();
		
		for(int i = 0; i < str.length(); i++) {
			if(table.containsKey(str.charAt(i))) {
				
				table.put(str.charAt(i), table.get(str.charAt(i))+1);
				
				
			}
			
			else {
				table.put(str.charAt(i), 1);
			}
		}
		
		System.out.println(table);
		
	}
	
	public static void main(String[] args) {
		
		frequency("aaaabbc");
	}

}
