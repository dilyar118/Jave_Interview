package String_Find_The_Unique;

import java.util.Arrays;
import java.util.Collections;

public class Solution02 {
	
	public static void main(String[] args) {
		
		System.out.println(Unique("heeellloo"));
		
	}

	public static String Unique(String str) {

		String result ="";

		for(String each : str.split(""))

		result += ((Collections.frequency(Arrays.asList(str.split("")), each)) ==1 ) ? each : "";

		 

		return result;

		}
	
}
