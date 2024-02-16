package org.threesevenpgms;
import java.util.*;
public class SumOfNumbers {

	public static void main(String[] args) {
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the value of 'n' : ");
		int n = scanner.nextInt();
		for(int i = 1; i<=n; i++) {
			if(i % 2 ==0) {
				count = count + i;
				//System.out.println(i);
			}
		}
		
		System.out.println("Sum of the numbers upto " + n + " is " + count);

	}

}
