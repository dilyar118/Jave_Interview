package FindMostFrequentChar;

import java.util.Collections;

public class Solution02 {
	
	public static void main(String[] args) {
		
		String str = "aabc";
	
//	int val = Collections.max(table.values());
//  System.out.println(table.entrySet());
    char[] arr = str.toCharArray();
    String fre = "";
    int max = 0;
    int index = 0;
    
    
    for (int i = 0; i < arr.length; i++) {    
    	int count = 0;
    	
        for (int j = 0; j < arr.length; j++) {    
            if (i != j && arr[i] == arr[j]) {
            	
            	
                count++;    
            }
        }
        
        if (count > max) {
            max = count;
            index = i;
            System.out.println(i);
        }
    
    
    }
    System.out.println("Most popular char: " + arr[index] );

}
	
}

