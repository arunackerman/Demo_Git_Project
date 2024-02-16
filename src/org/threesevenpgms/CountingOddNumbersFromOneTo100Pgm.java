package org.threesevenpgms;

public class CountingOddNumbersFromOneTo100Pgm {
	//Odd number count from 1 to 1000

	public static void main(String [] args){
	int count = 0;
	for(int i = 1; i <= 1000; i++){
	if(i % 2 != 0 ){
	count++;
	}
	}
	System.out.println("The total odd numbers from 1 to 1000 is " + count);
	}

}
