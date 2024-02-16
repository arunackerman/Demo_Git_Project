package org.threesevenpgms;

import java.util.Scanner;

public class ReversingTheNumber {
	//Reversing the number

	public static void main(String [] args){
	int i = 0, j = 0,  b;
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter the value 'a' : ");
	int a = scanner.nextInt();
	b = a;
	while(a > 0){
	i = a % 10;
	j = (j * 10) + i;
	a = a / 10;
	}
	System.out.println("The reverse of " + b + " is " + j);
	}
}
