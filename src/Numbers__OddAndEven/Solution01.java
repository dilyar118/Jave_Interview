package Numbers__OddAndEven;

import java.util.Arrays;

public class Solution01 {
	
	
	public static void main(String[] args) {
		
		System.out.println(identifyOddEven(43));
		
		int [] num = new int[]{1,2,3,4,5,6,7,8,9,10};
		int[] result=new int[5];
		int z=0;
		
		for(int i = 0; i < num.length; i++) {
			if(i % 2 == 0) {
				result[z]+=num[i];
				z++;
			}
			}
		System.out.println(Arrays.toString(result));
		
		
	}
	
	public static String identifyOddEven(int n) {
		
		return n % 2 == 0?"Even":"Odd";
	}

}
