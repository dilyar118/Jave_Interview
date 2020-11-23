package Numbers_FINRA;

import java.util.Arrays;

public class Solution03 {
	
	public static void main(String[] args) {
		 
		FINRA();
	}

	
	
	public static void FINRA() {

		String[] myarr= new String[30];

		 

		for( int i=0; i <= 30; i++ )

		myarr[i] = ""+(i+1);

		 

		for(int j=0; j<myarr.length; j++)

		if(Integer.valueOf(myarr[j])%3==0 && new Integer(myarr[j])%5==0)

		myarr[j]="FINRA";

		else if (Integer.valueOf(myarr[j])%3==0)

		myarr[j]="FIN";

		else if (Integer.valueOf(myarr[j])%5==0)

		myarr[j]="RA";

		 

		System.out.println(Arrays.toString(myarr));

		}
}
