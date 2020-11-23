package Array_Sort_Ascending;

import java.util.Arrays;

public class practice01 {
	
	
	public static void main (String[] args) {
		
		int[] num = {3,6,2,4,5,1};
		
		//Arrays.sort(num);
		
		for(int index = 0; index < num.length; index++) {
			
			for(int col = 0; col < index; col++) {
				
				if(num[index] < num[col]) {
					
					int temp = num[index];
					num[index] = num[col];
					num[col] = temp;
					
					
				}
			}
			
		}
		
		System.out.println(Arrays.toString(num));
		System.out.println(num.length-2);
		
	}

}
