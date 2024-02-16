package org.java.programs;

import java.util.InputMismatchException;

public class ThrowsChild extends ThrowsParent{

	public static void main(String[] args) {
		ThrowsChild tc = new ThrowsChild();
		//try {
		try {
			tc.arithmeticOperations();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//}
		//catch(InputMismatchException im) {System.out.println("Please provide integer inputs ");}
		//finally {System.out.println("Close the process");}

	}

}
