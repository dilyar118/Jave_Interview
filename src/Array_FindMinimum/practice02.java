package Array_FindMinimum;

public class practice02 {
	
	
	public static void main(String[] args) {
		
		int[] arr = {343,22,76677,222};
		
		System.out.println(minValue(arr));
	}
	
	
	
	
	public static int minValue(int[] num) {
		
		int min = Integer.MAX_VALUE;
		
		for(int each : num) {
			if(each < min) {
				
				min = each;
			}
			
			
		}
		
		
		return min;
	}

}
