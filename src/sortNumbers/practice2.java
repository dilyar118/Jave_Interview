package sortNumbers;

import java.util.Arrays;

public class practice2 {
	
	public static void main(String[] args) {
		
		int[] num = {30,20,25, 5, 15, 10};
		
		for(int i = 0; i < num.length; i++) {
			
			for(int j = 0; j < num.length; j++) {
				
				if(num[i] < num[j]) {
					
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
					
				}
			}
			
		}
			
			System.out.println(Arrays.toString(num));
		
		
		
		
	}

}
