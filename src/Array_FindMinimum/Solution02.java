package Array_FindMinimum;

import java.util.Arrays;

public class Solution02 {
	
	
	public static int minNum(int[] n) {
		
		int min = Integer.MAX_VALUE;
		
		for(int each  : n) {
			if( min > each) {
				min = each;
			}
			
		}
		
		return min;
	}

	
	public static void main(String[] args) {
		
		System.out.println(minNum(new int[] {34,23,87,12,66,69}));
		
		
	}
	
	
	
}
