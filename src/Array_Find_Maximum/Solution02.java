package Array_Find_Maximum;

import java.util.Arrays;

public class Solution02 {

	public static void main(String[] args) {
		
		System.out.println(maxValue(new int[] {343,56,34,87,344,323}));

	}

	public static int maxValue( int[]  n ) {

		Arrays.sort( n );

		return  n [ n.length-1 ];

		}
}
