package Numbers_Swap_Numbers;

public class Solution02 {
	
	public static void main(String[] args) {
		
		int  a = 10;      int  b  = 20;

		a = a^b;

		b = a^b;

		a = a^b;
		
		System.out.println(a);
		
	}

}
