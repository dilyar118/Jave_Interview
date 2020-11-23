package Frequency_Of_Characters_String;

public class practice03 {
	
	public static String frequencyOfChar(String str) {
		
		String nonDup = "";
		
		for(int i = 0; i < str.length(); i++) {
			if(!nonDup.contains(""+str.charAt(i))) {
				nonDup += ""+str.charAt(i) ;
			}
		}
		
		String expectedResult = "";
		
		for(int j = 0; j < nonDup.length(); j++) {
			
			int count = 0;
			
			for(int i = 0; i < str.length(); i++) {
				if( str.charAt(i)==nonDup.charAt(j) )
					
					count++;
			}
			
			expectedResult += nonDup.charAt(j) + "" + count;
		}
		
		return expectedResult;
	}

	public static void main(String[] args) {
		
		System.out.println(frequencyOfChar("aaaabbbccccddde"));
	}
}
