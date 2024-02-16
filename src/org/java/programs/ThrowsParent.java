package org.java.programs;
import java.util.*;

public class ThrowsParent {

	

	public static void main(String[] args) 
	{
		ThrowsParent tp = new ThrowsParent();
		//tp.arithmeticOperations();
	}

	public void arithmeticOperations() throws Exception{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the two values : ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = a / b;
		System.out.println("The value of c is " + c);
		arithmeticOperations();
		
	}

}
