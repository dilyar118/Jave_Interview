package ArrayList_Remove_Ahmed;

import java.util.*;

public class Solution02 {
	
	private static final List<int[]> ArrayList = null;

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

				for(ListIterator<String> it=names.listIterator(); it.hasNext();)

				        if(it.next().equals("Ahmed"))

				            it.remove();

				 

				System.out.println(names);
				
				
				
				
			
				
				
	}

}
