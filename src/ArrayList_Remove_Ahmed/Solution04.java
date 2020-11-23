package ArrayList_Remove_Ahmed;

import java.util.*;

public class Solution04 {
	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

			    Iterator<String> it = names.iterator();

			    while(it.hasNext()) {

			        if(it.next().equals("Ahmed"))

			            it.remove();

			    }

			    System.out.println( names );
		
	}

}
