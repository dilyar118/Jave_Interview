package Frequency_of_Words;

import java.util.*;

public class Solution {
	
	public static void main(String[] args) throws Exception {
        System.out.println(Findfrequncy());
    }
	
	
    public static Map<String, Integer> Findfrequncy() throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("please Enter word: ");
        String text = scan.nextLine();
        String[] unique = text.split(" ");
        Map<String, Integer> words = new HashMap<>();
        for (String str : unique) {
            if (words.containsKey(str)) {
                words.put(str, 1 + words.get(str));
            } else {
                words.put(str, 1);
                
            }
            
        }
        return words;
        
    }

}
