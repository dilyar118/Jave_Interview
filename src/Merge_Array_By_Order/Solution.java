package Merge_Array_By_Order;

import java.util.Arrays;

public class Solution {
	
	
	public static void main(String[] args) {
		
		
		int[] odd_number  = { 1, 3, 5, 7, 9 };
		int[] even_number = { 2, 4, 6, 8, 10 };

		int[] merged_number = new int[odd_number.length + even_number.length];

		int oddindex = 0;
		int evenindex = 0;
		int merindex = 0;

		while (oddindex < odd_number.length & evenindex < even_number.length) {

			if (odd_number[oddindex] < even_number[evenindex]) {

				merged_number[merindex] = odd_number[oddindex];
				merindex++;
				oddindex++;
			} else {

				merged_number[merindex] = even_number[evenindex];
				merindex++;
				evenindex++;

			}

		}

		while (evenindex < even_number.length) {

			merged_number[merindex] = even_number[evenindex];
			evenindex++;
			merindex++;

		}

		while (oddindex < odd_number.length) {

			merged_number[merindex] = odd_number[oddindex];
			merindex++;
			oddindex++;

		}
		

		System.out.println(Arrays.toString(merged_number));
	}

}
