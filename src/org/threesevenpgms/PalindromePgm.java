package org.threesevenpgms;
import java.util.*;

public class PalindromePgm {

	public static void main(String[] args) {
		PalindromePgm p = new PalindromePgm();
		p.palindrome();
		
	}

	private void palindrome() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number = scanner.nextInt();
		int original = number;
		int j = 0;
		while(number != 0) {
			int i = number % 10;
			j = (j * 10) + i;
			number = number / 10;
		}
		
		if(original == j) {
			System.out.println("The given number is palindrome");
		}
		
		else {System.out.println("The given number is not a palindrome");}

		palindrome();
	}

}
