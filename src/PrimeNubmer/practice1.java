package PrimeNubmer;

public class practice1 {
	
	public static void main (String[] args) {
		
		primeNumber(12);
		
		System.out.println("===================================");
		
		for(int i = 5; i > 0; i--) {
		
			for(int j = 1; j <= i; j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static int primeNumber(int num ) {
		
		boolean flag = false;
		
		for(int i = 2; i < num/2; i++) {
			
			if(num % i == 0) {
				
				flag = true;
				break;
			}
		}
		
		if(flag) {
			System.out.println(num + " is a prime number!");
		} else {
			System.out.println(num + " is not a prime number!");
		}
		return num;
	}

}
