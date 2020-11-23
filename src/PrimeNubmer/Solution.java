package PrimeNubmer;

public class Solution {

	public static void main(String[] args) {
		
		primeNumber(10);
		
		String str = "dfdfdfd3232kdkfdf";
		str=str.replaceAll("[a-z]", "");
		System.out.println(str);
		
//		int a = 0;
//		int b = 1;
//		
//		for(int i = 0; i < 10; i++) {
//			int c = a+b;
//			a=b; 
//			b=c;
//					
//					System.out.print(c + " ");
			
		//}

	}
		public static void primeNumber(int num) {
        boolean flag = false;
        int n = num/2;
        System.out.println(n);
        for(int i = 2; i <= n; i++)
        {
            // condition for nonprime number
            if(num % i == 0 )
            {
                flag = true;
                break;
            }
        }
        
        if (!flag)
            System.out.println(num + " is a prime number.");
        
        else
            System.out.println(num + " is not a prime number.");


}
		
		
		
		
}
