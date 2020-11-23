package Array_Find_Middle_Index;

import java.util.ArrayList;
import java.util.Arrays;

public class practice {
	
	
	
	public static void main(String[] args) {
		
		Integer[] arr = {2,5,8,3,1,5};
		
		ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(arr));
		
		int halfIndex = num.size()/2;
		
		if(num.size() % 2 == 0 ) {
			System.out.println("First middle index is \t" + num.get(halfIndex - 1));
			System.out.println("Second middle index is \t" + num.get(halfIndex));
			
		}
		
		else {
			
			System.out.println("The middle index is \t" + num.get(halfIndex));
		}
		
		
		
	}

}
