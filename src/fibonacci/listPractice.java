package fibonacci;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class listPractice {

	public static void main(String[] args) {
		
		int[] num = { 2,34,0,0,3};
		
		List<Integer> list = new ArrayList<>(Arrays.asList(2,3,6));
		
		System.out.println(list);
		
		list.removeAll(Collections.singletonList(0));
		
		System.out.println(list);

	}

}
