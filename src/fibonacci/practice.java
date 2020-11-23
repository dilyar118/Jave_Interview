package fibonacci;

public class practice {
	
	public static void main(String[] args) {
		
		
		int a = 0;
		int b = 1;
		
		for(int i = 1; i <= 8; i++) {
			
			int c = a + b;
			
			a = b; 
			b = c;
			
			System.out.print(c + ", ");
		}
		
		
	}

}
