package Array_Find_Middle_Index;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution1 {
	
	public static void main(String[] args) {
		
		Integer[] arr = {2,5,3,7,11};
		
		ArrayList<Integer> num = new ArrayList<>(Arrays.asList(arr));
		
		int halfIndex = num.size()/2;
		System.out.println("The half of the index is: \t" + halfIndex);
		
		//System.out.println(num.get(halfIndex));
		
		if(num.size() % 2 == 0 ) {
			System.out.println("This is the first middle index: \t" + num.get(halfIndex -1));
			System.out.println("This is the second middle index: \t" + num.get(halfIndex));
			
			
		}else {
			
			System.out.println("This is the middle index: \t" + num.get(halfIndex));
		}
		
		
		
	}

}
