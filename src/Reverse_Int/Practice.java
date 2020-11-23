package Reverse_Int;

public class Practice {
	
	public static void main(String[] args) {
		
		System.out.println(reverse(123));
	}
	public static int reverse(int num) {
		
		int reverse = 0;
		int digit = 0;
		
		while(num != 0) {
			digit = num % 10;
			reverse = reverse * 10 + digit;
			num = num/10;
		}
		return reverse;
	}

}
