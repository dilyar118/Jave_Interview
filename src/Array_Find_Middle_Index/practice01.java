package Array_Find_Middle_Index;

import java.util.ArrayList;
import java.util.Arrays;

public class practice01 {
	
	public static void main (String[] args) {
		
		//Integer[] num = {3,7,1,6,8,5};
		
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3,7,1,6,8,5));
		
		int halfIndex = arr.size()/2;
			
			if( arr.size()  % 2 == 0) {
				
				System.out.println(arr.get(halfIndex-1) + " is first half index");
				System.out.println(arr.get(halfIndex) + " is second half index");
				
			} else {
				System.out.println(arr.get(halfIndex) + "  is middle index");
			}
			
		}
	}


