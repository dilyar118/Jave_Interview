package Array_Sort_Descending;

import java.util.*;

public class removeDuplicate {
	
	public static void main(String[] args) {
		
		ArrayList <String> arr = new ArrayList<>();
		
	arr.addAll(Arrays.asList("omar", "omar","dily","dily"));
	
	ArrayList <String> newArr = new ArrayList<>();
//	 String names = Arrays.toString(arr);
	
	
		for(String a : arr) {
			if(!newArr.contains(""+a)) {
				newArr.add(a);
				
			}
		}
		
	System.out.println("++++++");
	System.out.println(newArr.toString());

	 
	 
	 
	 
	}

}
