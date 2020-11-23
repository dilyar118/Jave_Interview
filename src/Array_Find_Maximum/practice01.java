package Array_Find_Maximum;

import java.util.Arrays;
import java.util.Collections;

public class practice01 {
	
	public static void main(String[] args) {
		
		
		int[] arr = { 3,675,2,888,15,998,1};
		
		int max = Integer.MAX_VALUE;
		
		for(int each : arr) {
			
			if(max > each) {
				max = each;
			}
			
		}
		
		System.out.println(max);
		
		
	}
	
	

}
