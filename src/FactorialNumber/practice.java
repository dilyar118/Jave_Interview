package FactorialNumber;

import java.util.Scanner;

public class practice {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = input.nextInt();
		
		int factorial = 1;
		for(int i = 1; i <= num; i++) {
			factorial = factorial * i;
			
		}
		System.out.println(factorial);
		
	}
	
	

}
