package ArrayList_Remove_Some_Values;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution01 {
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));

		ArrayList<Integer> list2 = new ArrayList<>();

		    for(int  each : list1) 

		    if( each < 100)

		    list2.add(each);

		 

		    list1=list2;     

		    System.out.println(list1);
	}
	
	
	
	

}
