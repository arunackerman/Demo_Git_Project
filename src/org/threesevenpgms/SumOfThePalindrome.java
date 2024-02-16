package org.threesevenpgms;
import java.util.*;


public class SumOfThePalindrome {

	public static void main(String[] args) {
		SumOfThePalindrome sp = new SumOfThePalindrome();
		sp.sumOfPalindrome();

	}

	private void sumOfPalindrome() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the value : ");
		int number = scanner.nextInt();
		int original = number, k = number, j = 0,r, sum = 0 ;
		
		for(int i = 0; i <=number; i++) {
			while(k !=0) {
				r = k % 10;
				j = (j * 10) + r;
				k = k/10;
			}
			if(original == j) {
				sum = sum + j;
			}
			
			System.out.println("The sum of the palindrome numbers upto " + number + " is " + sum);
		}
		
	}

}
