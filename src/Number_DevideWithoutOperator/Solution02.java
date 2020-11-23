package Number_DevideWithoutOperator;

public class Solution02 {
	
	public static void devides(int num1, int num2) {
		
		if(num2 == 0) {
			
			System.out.println("Invalid Number");
			
				return;
		}
		
		System.out.println(num1 + " devide by " + num2 + " is: ");
		
				int count = 0;
				
			while(num1 >= num2) {
				
				num1 -= num2;
				
				count++;
			}
			
		System.out.println(count + " and remainder is " + num1);
	}
	
	public static void main(String[] args) {
		
		devides(9,3);
		
		
		String str = "02/02/20";
		String pallindrome = "";
		
		
		for(int i = str.length()-1; i >= 0; i--) {
			pallindrome += str.charAt(i);
			
		}
				
			
			
			if(str.equals( pallindrome) ){
				
				
				System.out.println("this is palindrome!");
				
			}
			
			
			else {
				System.out.println("not palindrome");
			
		}
	

	}
}
