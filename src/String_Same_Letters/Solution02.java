package String_Same_Letters;

import java.util.*;

public class Solution02 {
	
	public static void main(String[] args) {
		
		System.out.println(Same("java", "jvaa"));
		
		
		
	}
	
	public static boolean Same(String str1, String str2) {

		str1 = new TreeSet<>(Arrays.asList( str1.split("") ) ).toString( );

		str2 = new TreeSet<String>(Arrays.asList( str2.split("") ) ).toString( );
		
		

		return  str1.equals(str2);

		
		
			
		}
	
	
	

}
