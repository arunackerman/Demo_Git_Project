package org.threesevenpgms;

import java.util.Scanner;

public class AmstrongNumberFrom1ToN {
	// printing amstrong numbers from 1 to n;

	public static void main(String [] args){
	System.out.print("Enter the value n : ");
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();

	for(int k = 1; k <= n; k++){
	int a = k, original = k, i = 0, number = 0;

	while(a > 0){
	i = a % 10;
	number = number + (i * i * i);
	a = a / 10;
	}

	if( original == number){
	System.out.println(number);
	}
	}
	}

}
