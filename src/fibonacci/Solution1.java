package fibonacci;

public class Solution1 {
	
	public static void main(String[] args) {
		
		// Fibonacci
		
		int a = 0;
		int b = 1;
		
		for(int i = 1; i <= 7; i++) {
			
			int c = a+b;
			a = b;
			b = c;
		
			System.out.print(c + ", ");
		
		
		}
		
		System.out.println();
		
		
		
		int a1 = 0;
		int b1 = 1;
		
		for(int i = 1; i <= 8; i++) {
			
			int c1 = a1+b1;
			a1 = b1;
			b1 = c1;
			
			System.out.print(c1 + ", ");
		}
	}

}
