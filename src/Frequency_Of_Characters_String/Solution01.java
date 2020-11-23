package Frequency_Of_Characters_String;

public class Solution01 {
	
	

	

	public static void main(String[] args) {
		
		String str = "aabbbcccc";

		String nonDup = "";

		for(int i = 0; i < str.length(); i++){
			
			if(!nonDup.contains("" + str.charAt(i)))

			nonDup+= "" +str.charAt(i);
		} 

		String frequency = "";

		for(int j = 0; j < nonDup.length(); j++){
			
			int count = 0;
			for(int k = 0; k < str.length(); k++){

			if(nonDup.charAt(j) == str.charAt(k))
			count++;
			}

			frequency += nonDup.charAt(j) + "" + count;
			
		}

			System.out.println(frequency);
		
		
		 
		//System.out.println(FrequencyOfChars("AAABBCDDAA"));
		
		
	}
	
//	public static String FrequencyOfChars(String str) {
//
//	//	String str = "hellloooee";
//		String nonDup = "";
//
//		for(int i=0; i < str.length(); i++) {
//
//		if(!nonDup.contains(""+str.charAt(i))) {
//
//		nonDup+= str.charAt(i);
//		
//		
//	}
//		}
//
//		String expectedResult = "";
//	
//
//	for( int j=0;j < nonDup.length(); j++) {
//
//	int count = 0;
//
//	for(int i=0; i < str.length(); i++) {
//
//	if(str.charAt(i) == nonDup.charAt(j)) 
//
//	count++;
//
//	}
//
//	expectedResult += nonDup.charAt(j)+"" + count;
//
//	}
//
//	return expectedResult;
//
//	
//	/*
//	   
//	 
//	 
//	 */
//	}

}


