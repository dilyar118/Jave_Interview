package Array_FindMinimum;

public class Solution01 {
	
	
	public static void main(String[] args) {
		
	System.out.println(maxValue(new	int[] { 45, 34, 65, 23, 4, 12}));
		
		
		
		
		
		
	}
	
	
	public static int maxValue(int[] n) {
		
		int min = Integer.MAX_VALUE;
		
		for(int each:n) {
			
			if(each < min) {
				
				min = each;
				
				
			}
		}
		return min;
	}
	

}
