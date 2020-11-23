package Array_Find_Maximum;

public class Solution01 {
	
	public static void main(String[] args) {
		
		int [] num = {4,3,5,2,6,7,1};
		
		
System.out.println(maxValue( num));
		
		//System.out.println(maxValue(j));
		
		
		
	}
	
	public static int maxValue( int[]  n ) {

		int max = Integer.MIN_VALUE;

		for(int each: n) {

		if(each > max) {

		max = each;
		}
		}

		return max;

		}

}
