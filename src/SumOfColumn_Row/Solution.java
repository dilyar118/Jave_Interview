package SumOfColumn_Row;

import java.util.Arrays;

public class Solution {
	
	
	public static void main(String[] args) {
		
	int[][] numarray = 
	               {
	                {1,2,3,0},
	                {4,5,6,0},
	                {7,8,9,0},
	                {0,0,0,0}
	               };
	
	int sumofrow = 0;
	int rowindex = 0;

	for (int row = 0; row < numarray.length; row++) { // extract the value row by row

		for (int col = 0; col < numarray[row].length; col++) {

			if (rowindex <= row) { // array row index focus on single line
				sumofrow += numarray[row][col];
				rowindex = row;

				if (rowindex == row && col == numarray[0].length - 1) { // storing the row summary to the last
																		// column in the same row

					if (row + 1 != numarray.length) { // save last row as empty

						numarray[row][numarray[0].length - 1] = sumofrow;
//						System.out.println("The Row sum is " + sumofrow);
						sumofrow = 0; // return sum of row to 0

					}
				}
			}

			/*
			 * if (rowindex == numarray.length - 1 && col == numarray[row].length - 1) { //
			 * this is execute loop only one time and extract the value column by column
			 * 
			 * while (columnrow < numarray.length - 1) {
			 * 
			 * System.out.println(""); sumofcolumn += numarray[columnrow][col];
			 * System.err.println("The Sum of column is " + sumofcolumn); sumofcolumn = 0;
			 * columnrow++; }
			 * 
			 * }
			 */
		}

	}

	int sumofcolumn = 0;
	int colindex = 0;

	for (int col = 0; col < numarray[0].length; col++) {

		for (int row = 0; row < numarray.length - 1; row++) {

			if (row < numarray.length - 1) {

				sumofcolumn = sumofcolumn + numarray[row][col];
				colindex = col;

				if (colindex == col && row == numarray.length - 2) {

//					System.out.println("The Row : " + row + " Column : " + col + " value is " + numarray[row][col]
//							+ " The sum is " + sumofcolumn);

					numarray[numarray.length-1][col]=sumofcolumn;
					sumofcolumn = 0;

				}
			}
		}

	}

	System.out.println(Arrays.deepToString(numarray));

}
	
}
