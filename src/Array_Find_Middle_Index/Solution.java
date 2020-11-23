package Array_Find_Middle_Index;

import java.util.*;

public class Solution {
	
	public static void main(String[] args) {
		
		
		Integer[] array = {1, 6, 3, 4, 7};
		   
		ArrayList<Integer> num = new ArrayList<>(Arrays.asList(array));
		
//		System.out.println( num.size());
		int halfIndex = num.size()/2;
		
//		System.out.println(halfIndex);
//		System.out.println(num.get(halfIndex));
		if(num.size() % 2 == 0) {
			System.out.println("This is first middle index \t" + num.get(halfIndex-1));
			System.out.println("This is second middle index \t" + num.get(halfIndex));
		
		
		}
		
		else {
			System.out.println("This is middle index \t" + num.get(halfIndex));
		}
		
		
		
		
		 
		 
		 
		 
		 
		 
		 
		
	}
	
	


}
