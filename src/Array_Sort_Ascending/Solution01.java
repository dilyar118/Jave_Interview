package Array_Sort_Ascending;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution01 {
	
	public static void main(String[] args) {
		
		int[] n = {3,6,4,5,1};
		System.out.println(ascOrder(n));
		
	}

	public static String ascOrder(int[] num) {
		
		for(int i = 0; i < num.length; i++) {
			
			for(int k = 0; k < num.length; k++) {
				
				if(num[i] < num[k]) {
				int temp = num[i];
				
				num[i] = num[k];
				
				num[k] = temp;
				}
			}
		}
		
		return Arrays.toString(num);
		}
		
}
