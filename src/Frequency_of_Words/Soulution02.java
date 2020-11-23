package Frequency_of_Words;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Soulution02 {
	
	/*
	 	Given this String str="tomorrow is thursday but it is also thursday";  
	 	 give me the number of words repeated only with number of times it was repeated
	 	
	 */

	public static void main(String[] args) {
		
		String str="tomorrow is thursday but it is also thursday";
		
		String[] arr = str.split(" ");
		
		String result = "";
		
		
		for(int i = 0; i < arr.length; i++) {
				
			int count = 0;
				for(int k =0; k < arr.length; k++) {
					if(arr[i].contains(arr[k])) {
						count++;
					}
					
				}
				if(count > 1) {
					result += arr[i]+count+" ";
				}
		}
				System.out.println(result);
		
				System.out.println("=======================");
				
			
				str = new LinkedHashSet<String>(Arrays.asList(result.split(" "))).toString();
				
				System.out.println(str);

	}
		
	}

