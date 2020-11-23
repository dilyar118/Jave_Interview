package InterviewPractising;

public class factorialNumber {
	
	
	public static void factorial(int number) {
		
		int num = 1;
		
		for(int i = 1; i < number; i++) {
			
			num = num * i;
		}
		System.out.println(num);
		
		}
	
	public static void main(String[] args) {
		
		factorial(7);
	}

}
