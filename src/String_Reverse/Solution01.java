package String_Reverse;

public class Solution01 {

	public static void main(String[] args) {
		
		System.out.println(StrReverse("hello"));

	}
	
	public static String StrReverse(String str) {

		String reverse="";

		for(int i=str.length()-1; i >= 0; i--)

		reverse += str.toCharArray();
		
	    //  reverse += str.charAt(i); gives you same result but slower if string is too long

		 

		return  reverse;

		}

}
