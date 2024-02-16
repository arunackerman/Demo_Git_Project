package org.threesevenpgms;

import java.util.Scanner;

public class OddOrEvenPgm {
	public static void main(String args[]){
		OddOrEvenPgm e = new OddOrEvenPgm();
		e.oddOrEvenPgm();
		
		}

	private void oddOrEvenPgm() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the input value : ");
		int number = scanner.nextInt();
		if(number % 2 == 0 ){
		System.out.println("The number is even");
		} else{
		System.out.println("The number is odd");
		oddOrEvenPgm();
		}
		
	}
}
