package org.threesevenpgms;

public class CountingEvenNumbersFromOneTo100Pgm {
	// Even number count from 1 to 100

	public static void main(String [] args){
	int count = 0;
	for(int i = 1; i <=100; i++){
	if(i % 2 == 0){
	count++;
	}
	}
	System.out.println("The count of even numbers from 0 to 100 is " + count);
	}

}
