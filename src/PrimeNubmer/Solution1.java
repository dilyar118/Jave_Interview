package PrimeNubmer;

public class Solution1 {
	
	public static void main(String[] args) {
		
		prime(12);
	}
	
	
	
	public static int prime(int num) {
		
		boolean flag = false;
			
		for(int i = 2; i < num/2; i ++) {
			
			if(num % i == 0) {
				
				flag = true;
				break;
			}
		}
		
		if(!flag) {
			
			System.out.println(num + "  is a prime number");
		}
		
		else {
			
			System.out.println(num + "  is not a prime number");
		}
		
		
		return num;
	}

}
