package ArrayList_Remove_Some_Values;

import java.util.ArrayList;
import java.util.Arrays;

public class practice {
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));
		
		ArrayList<Integer> list2 = new ArrayList<>();
		
		for( int each : list1) {
			if( each < 200) {
				list2.add(each);
			}
		}
			System.out.println(list2);
			
			
			ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1,3,4,5,200,234,50));
			
			ArrayList<Integer> list4 = new ArrayList<>();
			
			for(int each : list3) {
				
				if(each < 100) {
					
					list4.add(each);
				}
			}
			
			System.out.println(list4);
		
	}

}
