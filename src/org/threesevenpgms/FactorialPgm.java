package org.threesevenpgms;

import java.util.Scanner;

public class FactorialPgm {

	public static void main(String[] args) {
		int fact = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the value 'n' : ");
		int n = scanner.nextInt();
		for(int i = 1; i<=n; i++) {
			fact = fact *i;
		}
		
		System.out.println("The factorial value is " + fact);

	}

}
