package Frequency_Of_Characters_String;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution06 {
	
	public static void main(String[] args) {
		
		int[] arr = {2,5,7,11,6,3,9,23,77};  //{2,5,6,7,11}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
//		System.out.println(arr.toString().charAt(arr.length-2)+"");
		System.out.println(arr[arr.length-3]);
		
//		String blah = "HelllO";
//		int count = 0;
//		for (char c : blah.toCharArray()) {
//		    count++;
//		}
//		System.out.println("blah's length: " + count);
		
//		String str = "AAABBCDDDDEEF";
//		Map<Character, Integer> charMapCount = new HashMap<>();
//		for (Character c : str.toCharArray()) {
//		    if (charMapCount.containsKey(c)) {
//		        charMapCount.put(c, charMapCount.get(c) + 1);
//		    } else {
//		        charMapCount.put(c, 1);
//		    }
//		}
//		
//		System.out.println(charMapCount);
//		
//	}
	
	

	String str = "mymy";
	Map<Character, Integer> charMapCount = new HashMap<>();
	
	for(int i = 0; i < str.length(); i++) {
		if(charMapCount.containsKey(str.charAt(i))) {
			charMapCount.put(str.charAt(i), charMapCount.get(str.charAt(i))+1);
		}
		else {
			charMapCount.put(str.charAt(i), 1);
			
		}
	}
	
	System.out.println(charMapCount.toString().replace("{", "").replace("=", "").replace("}", "").replace(",", "").replace(" ", ""));
	}

	
	
}
