package Array_FindMinimum;

public class practice01 {
	
	public static void main(String[] args) {
		
		
		int[] arr = { 323, 65,224, 656,662,67};
		
		int min = Integer.MAX_VALUE;
		
		for( int each : arr) {
			if( min > each ){
				
				min = each;
				
				
				//min = arr.length-1;
				
			}
				
			}
		System.out.println(min);

		
	}

}
