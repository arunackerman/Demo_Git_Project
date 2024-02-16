package org.threesevenpgms;

public class OddOrEven {
	static int countEven, countOdd;
	//int countOdd = 0;
	public static void main(String[] args) {
		
		for(int i = 1; i<=100; i++) {
			if(i%2 == 0) {
				countEven++;
				System.out.println(i + " is even");
			}
			else {
				countOdd++;
				System.out.println(i + " is odd");}
		}
		
		System.out.println("Number of even numbers " + countEven);
		System.out.println("Number of odd numbers " + countOdd);
	}

}
