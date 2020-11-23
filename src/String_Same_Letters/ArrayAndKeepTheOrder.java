package String_Same_Letters;

import java.util.Arrays;

public class ArrayAndKeepTheOrder {

	public static void main(String[] args) {

		int[] a = { 0, 0, 8, 0, 5, 9, 2 };
		
		
		int count = 0; 
		
		for(int i = 0; i < a.length; i++) {
			
			
			
			if(a[i] != 0) {
				if(i == count) {
					count++;
					
					}
				else {
					a[count] = a[i];
					a[i] = 0;
					count++;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		
		
		String str = "Civic";
		
		String palindrome = "";
		for(int i =  str.length()-1; i >= 0; i--) {
			palindrome += str.charAt(i)	;
		}
			if(str.equals(palindrome)) {
				
			
				System.out.println("this is palindrome");
			}else
			{
				System.out.println("this is not ");
			}
		
		
	}

}
