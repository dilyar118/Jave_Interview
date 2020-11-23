package ArrayList_Remove_Ahmed;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution01 {
	
	public static void main(String[] args) {
		
		String arr[] = {"Ahmed", "John", "Eric", "Eric", "Ahmed"};
		
		ArrayList<String> names = new ArrayList<>(Arrays.asList(arr));

				names.removeAll( Arrays.asList("Ahmed"));

				 System.out.println(names);
				 
				 
				 names.removeAll(Arrays.asList("Eric"));
				 
				 System.out.println(names);
				 
				 
				 
				 ArrayList<String> name = new ArrayList<>(Arrays.asList("owais","fatime","dilyar","fatime"));
				 
				 name.removeAll(Arrays.asList("fatime"));
				 System.out.println(name);
	}
	
	

}
