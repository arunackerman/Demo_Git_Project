package org.threesevenpgms;

public class CountingDigits {
	// counting the digits

	public static void main(String [] args){
	int count = 0, number = 1234567;
	while(number > 0){
	number = number / 10;
	count++;
	}
	System.out.println("Number of digits " + count);
	}

}
