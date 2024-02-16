package org.java.programs;

import java.util.InputMismatchException;
//import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.*;
public class ExceptionHandlingPgm {
	public void method1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two values: ");
		try {
		int value1 = scanner.nextInt();
		int value2 = scanner.nextInt();
		int answer = value1/value2;
		System.out.println("The answer is "+ answer);
		}
		catch(ArithmeticException eo1) {System.out.println("You have entered invalid values. Please enter valid values");}
		//catch(InputMismatchException eo2) {System.out.println("Enter valid integer values");}
		//catch(InputMismatchException im) {System.out.println("Wrong inputs. Provide a valid inputs");}
		catch(InputMismatchException im) {System.out.println("Enter the correct integer value other than 0");}
		method1();
	}
	
	public void method2() {
		try {
			String s = null;
			System.out.println(s.charAt(3));
			}
		//finally {System.out.println("Exception happend");}
		
		catch(NullPointerException ne) {System.out.println("Wrong value");}
	}
	public static void main(String [] args) {
		ExceptionHandlingPgm objref = new ExceptionHandlingPgm();
		//objref.method1();
		objref.method2();
	}

}
