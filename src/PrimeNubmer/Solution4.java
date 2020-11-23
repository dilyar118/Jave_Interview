package PrimeNubmer;

public class Solution4 {
	
	public static void main(String[] args) {
		
		prime(5);
		
		
	}
	
	public static int prime(int num ) {
		
		boolean flag = false;
		
		for(int i = 2; i <= num/2; i++) {
			if(num % i == 0) {
				flag = true;
				break;
			}
		}
		
		if(!flag) {
			
			System.out.println(num + " is prime number!");
		}else {
			
			System.out.println(num + " is not prime number!");
		}
		
		return num;
	}

}
