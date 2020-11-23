package sortNumbers;

import java.util.Arrays;

public class practice {
	
	
	public static void main(String[] args) {
		
		int[] num = {22,54,12,40};
		
		for (int i = 0; i < num.length; i++) {
			
			int temp = num[i];
			
			for (int j = 0; j < num.length; j++) {
				
				if(num[j] > num[i]) {
					
					num[i] = num[j];
					
					num[j] = temp;
				}
				
			}
			
		}
	System.out.println(Arrays.toString(num));
		
		
	}

}
