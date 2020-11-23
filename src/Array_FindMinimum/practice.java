package Array_FindMinimum;

public class practice {

	public static void main(String[] args) {

		int[] arr = {34,2,556,21,54};
		System.out.println(min(arr));
		
		
	}

	public static int min(int[] n) {
		
		int min = Integer.MAX_VALUE;
		for(int each : n) {
			if(each < min) {
				
			
			min = each;
		}
		}
		return min;
	}
}
