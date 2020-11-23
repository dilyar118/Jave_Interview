package Number_DevideWithoutOperator;

public class Solution01 {
	
	public static void main(String[] args) {
		
		devides(150, 30);
		
	}
	
	
	public static void devides(int num1, int num2) {
		if(num2 == 0) {
			System.out.println("Invalid Number");
			return;
		}
		
		System.out.println(num1 + " devide " + num2);
		
		int count = 0;
		while(num1 >= num2) {
			num1 -= num2;
			count++;
			
		}
		
		System.out.println(count + " and remainder is: " + num1);
					
				
		
	}

}
