package Array_Find_Maximum;

public class practice {
	
	public static void main(String[] args) {
		
		int [] arr = {4,7,3,87,43};
		System.out.println(max(arr));
	}
	
	public static int max(int [] n) {
		int max = Integer.MIN_VALUE;
		
		for(int each : n) {
			if(each > max) {
				max = each;
			}
		}
		return max;
	}

}
