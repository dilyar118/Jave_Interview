package ArrayList_Remove_Some_Values;

import java.util.*;

public class Solution02 {
	
	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));

        Iterator<Integer> it = list.iterator();

        while(it.hasNext())

            if(it.next()>100)

                  it.remove();

         

        System.out.println(list);
		
	}

}
