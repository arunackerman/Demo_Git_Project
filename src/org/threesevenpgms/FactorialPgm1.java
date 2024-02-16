package org.threesevenpgms;

import java.util.Scanner;

public class FactorialPgm1 {
	//factorial from 1 to 5
	public void factorial() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the value 'n' : ");
		int n = scanner.nextInt();
	int fact = 1;
	for(int i = 1; i<=n; i++){
	fact = fact * i;
	}
	System.out.println("Factorial from 1 to 5 is " + fact);
	factorial();
	}

	public static void main(String[]args){
		FactorialPgm1 f = new FactorialPgm1();
		f.factorial();
		
	}

}
