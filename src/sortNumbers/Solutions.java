package sortNumbers;

import java.util.Arrays;

public class Solutions {
	
	public static void main(String[] args) {
		
		int [] num = {45,30,8,25,40,20,15,10};
		Arrays.sort(num);
		
		System.out.println(num[3]);
		System.out.println(Arrays.toString(num));
		
		for(int i = 0; i <= num.length-1; i++) {
			System.out.print(num[i]+" ");
		}
			
				System.out.println("\n-----");
				
//		for (int i = 0; i < num.length; i++) {
//			for (int j = 0; j < num.length; j++) {
//				if(num[j]<num[i]) {
//					int temp=num[i];
//					num[i]=num[j];
//					num[j]=temp;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(num));
				
				for (int i = 0; i < num.length; i++) {
					for (int j = 0; j < num.length; j++) {
						if(num[j] > num[i]) {
							int temp = num[i];
							num[i] = num[j];
							num[j] = temp;
						}
					}
				}
			System.out.println(Arrays.toString(num));
			
			
		}

}
