package org.threesevenpgms;
import java.util.*;

public class ReverseNumbers {

	public static void main(String[] args) {
		System.out.print("Enter the number : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("Number before reversal : " + number);
		int i,j=0;
		while(number !=0) {
			i = number % 10;
			j = (j * 10) + i;
			number = number / 10;
		}
		System.out.println("After reversal : " + j);

	}

}
