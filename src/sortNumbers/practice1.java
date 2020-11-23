package sortNumbers;

import java.util.Arrays;

public class practice1 {
	
	public static void main(String[] args) {
		
		
		int[] num = {20, 25, 10, 30, 5, 15};
		
		for(int i = 0; i < num.length; i++) {
			
			for(int k = 0; k < num.length; k++) {
				
				if(num[i] < num[k]) {
				int temp = num[i];
				num[i] = num[k];
				num[k] = temp;
				
				}
			}
		}
			System.out.println(Arrays.toString(num));
		
	}

}
