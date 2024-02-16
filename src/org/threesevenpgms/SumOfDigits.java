package org.threesevenpgms;

public class SumOfDigits {
	// sum of the  digits of a number

	public static void main(String [] args){
	int number = 11, count = 0, i = 0;
	while(number > 0){
	i = number % 10;
	count = count + i;
	number = number / 10;
	}
	System.out.println("Sum of the digits of a number " + count);
	}


}
