package Array_Find_Maximum;

public class practice2 {
	
	public static void main (String[] args) {
		
	
	int[] n = {34, 433, 22, 4454, 776, 334};

	System.out.println(maxValue(n));
	
	}
	public static int maxValue(int[] num) {
		
		int max = Integer.MIN_VALUE;
		
		for(int each : num) {
			
			if(each > max) {
				
				max = each;
			}
		}
		return max;
	}

}
