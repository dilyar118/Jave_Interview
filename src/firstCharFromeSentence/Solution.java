package firstCharFromeSentence;

public class Solution {
	
	public static void main(String[] args) {
		
		String str = "Today is raining";
		String[] arr =  str.split(" ");
		
		String firstLetter = "";
		
		for(int i = 0; i < arr.length; i++) {
			firstLetter += arr[i].substring(0,1);
		}
		System.out.println(firstLetter);
	}
	
	
	

}
