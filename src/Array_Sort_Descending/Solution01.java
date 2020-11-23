package Array_Sort_Descending;

import java.util.ArrayList;

public class Solution01 {

	public static void main(String[] args) {
		System.out.println(Sort(new int[] {3,4,5,6,7}));
		
	}
	
	public static int[] Sort(int[] a) {

		ArrayList<Integer> list=new ArrayList<Integer>();

		for(int each: a)

		list.add(each);

		 

		for(int i=0; i < a.length; i++) {

		a[i] = findMax(list);

		list.remove(Integer.valueOf(a[i]));

		}

		return a;

		}

		 

		public static int findMax(ArrayList<Integer> a) {

		int max=Integer.MIN_VALUE;

		for(int each: a)

		max = Math.max(max, each);

		return max;

		}
}
