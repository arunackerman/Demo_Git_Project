package org.threesevenpgms;

import java.util.Scanner;

public class PalindromePgmm {
	//Palindrome or not

	public static void main(String [] args){
	System.out.print("Enter the value : ");
	Scanner scanner  = new Scanner(System.in);
	int value = scanner.nextInt();
	int i = 0, j = 0, original = value; 

	while(value > 0){
	i = value % 10;
	j = (j * 10) + i;
	value = value / 10;
	}

	if(original == j){
	System.out.println("The value " + original + " is palindrome" );
	}else{System.out.println("The value " + original + " is not a palindrome");}
	}

}
