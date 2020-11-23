package ArrayList_Remove_Ahmed;

import java.util.ArrayList;
import java.util.Arrays;

public class practice {
	
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>(Arrays.asList("Alim", "Ahmet", "Ahmet", "memet"));
		
		names.removeAll(Arrays.asList("Ahmet"));
		System.out.println(names);
	}

}
