package Frequency_Of_Characters_String;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Solution03 {
	
	public static void main(String[] args) {
		
		System.out.println(FrequencyOfChars("heeeooollloo"));
		
	}

	public  static  String  FrequencyOfChars(String str) {

		String b=new LinkedHashSet<>(Arrays.asList(str.split(""))).toString();

		  b = b.replace(", ","").replace("[","").replace("]","");

		String result="";

		for(int j=0; j<b.length();j++) {

		int count=0;
		

		for(int i=0; i<str.length(); i++) {

		if(str.substring(i, i+1).equals(""+str.charAt(j))) {

		count ++;

		
		}
		}
		result+=b.substring(j, j+1)+count;

		
		
		
		}
		return result;

		
}
}


