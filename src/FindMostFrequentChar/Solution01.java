package FindMostFrequentChar;

import java.util.*;

public class Solution01 {
	
    
	
	public static void main(String[] args) {
        String str = "AAABBBBCCC";
        String r ="";
        Map<Character,Integer> table=new LinkedHashMap<>();
        for(Character letter : str.toCharArray()){
            if(table.containsKey(letter)) {
                table.put(letter, table.get(letter) + 1);
            }else{
                table.put(letter,1);
            }
        }
            int max=0;
            for(Map.Entry<Character, Integer> each : table.entrySet()){
               if(each.getValue()>=max){
                   max=each.getValue();
                   r = each.getKey()+""+max;
               }
            }
            
           System.out.println(r);
      
           System.out.println("=============================================================================");
           
//           String word = "aaabbc";
//           String result ="";
//           
//           Map<Character, Integer> table1 = new LinkedHashMap<>();
//           for(Character charr : word.toCharArray()) {
//        	   if(table1.put(key, remappingFunction))
//           }
           
	}
	
}


