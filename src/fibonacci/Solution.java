
package fibonacci;

public class Solution {
	
	public static void main(String[] args) {
		
	
	
	int a = 0;
	int b = 1;
	
	for(int i = 1; i <= 9; i++) {
		int c = a+b;
		a=b; 
		b=c;
				
				System.out.print(c + ", ");
		
	}
	
	}
}
