package org.threesevenpgms;

public class SumOfEvenNumbers {
	//Sum of even and odd numbers

	public static void main(String [] args){
		int sum = 0;
		for(int i = 1; i <= 50; i++){
		if(i % 2 == 0){
		sum = sum + i;
		}
		}
		System.out.println("The sum of even numbers from 1 to 50 is " + sum);
		}
	
}
