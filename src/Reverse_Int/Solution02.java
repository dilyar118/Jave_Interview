package Reverse_Int;

public class Solution02 {
	
	public static void main(String[] args) {
		int number = 12321;
		int a = number;
		
        int reverse = 0;  
		
		int remainder = 0;  
		
		do{   remainder = number%10;  
		
		reverse = reverse*10 + remainder;  
		
		number = number/10;  
		}
		
		while(number > 0); 
		
		System.out.println(a);
	
	
	if(a == reverse) {
		System.out.println("Yes polindrome");
		
	}
	else {
		System.out.println("no polindrome");
	}
	}

}
