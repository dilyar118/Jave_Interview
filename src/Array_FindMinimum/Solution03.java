package Array_FindMinimum;

public class Solution03 {
	
	public static int minValue(int[] num) {
		
		int min = Integer.MAX_VALUE;
		
		for(int each:num) {
			if(min > each) {
				min = each;
			}
		}
		
		return min;
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(minValue(new int[] {343,232,44,62,213}));
		
	}

}
