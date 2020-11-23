package PrimeNubmer;

public class practice {
	
	
	public static void main(String[] args) {
		
		primeNumber(11);
	}
	
	public static int primeNumber(int num) {
		
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
