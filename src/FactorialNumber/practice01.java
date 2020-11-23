package FactorialNumber;

import java.util.Scanner;

public class practice01 {

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please Enter the Factorial Number");
		
		int num = input.nextInt();
		
		int factoNum = 1;
		
		for(int i =1; i <= num; i++) {
			
			factoNum = factoNum * i;
		}
		
		System.out.println(factoNum);
	}
}
