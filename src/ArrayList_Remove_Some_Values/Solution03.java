package ArrayList_Remove_Some_Values;

import java.util.*;

public class Solution03 {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));

        for(ListIterator<Integer> il = list.listIterator(); il.hasNext();)

            if(il.next()>100)

                il.remove();

         

        System.out.println(list);
	}

}
