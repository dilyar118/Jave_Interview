package Array_Find_Maximum;

public class Solution3 {
	
	public static void main(String[] args) {
		
		 int[] arr = {232,445,22,666,1234};
		 System.out.println(max(arr));
	}
	
	
	public static int max(int[] arr) {
		
		int max = Integer.MIN_VALUE;
		
		for(int each : arr) {
			if(each > max) {
				max=each;
			}
		}
	return max;	
	}

}
