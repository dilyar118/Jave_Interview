package ArrayList_Remove_Ahmed;

import java.util.*;

public class Solution03 {

public static void main(String[] args) {
	
	
	List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

			List<String> names2 = new ArrayList<>();

			    names.forEach(p-> {if(p.equals("Ahmed")) names2.add(p);}  );

			 

			System.out.println(names2);
}
	
}
