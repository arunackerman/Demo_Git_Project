package org.threesevenpgms;

import java.util.Scanner;

public class SumOfTheNumber {
	//Sum of the numbers from 1 to n

	public static void main(String [] args){
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter the value 'n' : ");
	int n = scanner.nextInt();
	int sum  = 0;
	for(int i = 1; i <= n; i++){
	sum = sum + i;
	}

	System.out.println("The sum of numbers from 0 to n is " + sum);

	}

}
