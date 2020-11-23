package Numbers_Divisible_by_3_5_15;

import java.util.Arrays;

public class Solution01 {
	
	public static void main(String[] args) {
		
		int [] arr = new int [100];
		
		String div15 = "";
		String div5 = "";
		String div3 = "";
		
		for(int i = 1; i <= arr.length; i ++) {
			if(i%15==0 && i%3==0) {
				div15 += i+" ";
			}	
				else if(i % 3 ==0 && i % 15 !=0){
					div3 += i+" ";
			}
				else if (i % 5 == 0 && i% 15!=0) {
					div5 += i +" ";
				}
		}
		
		System.out.println("Divisible By 15: "+div15);

		System.out.println("Divisible By 5: "+div5);

		System.out.println("Divisible By 3: "+div3);
	}

}
