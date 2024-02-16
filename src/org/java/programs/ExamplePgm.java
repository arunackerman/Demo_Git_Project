package org.java.programs;

public class ExamplePgm {

	public static void main(String[] args) {
		int a = 4,b = 9,c;
		c = a + b;
		System.out.println("The valuel of c is " + c);
		try {
		int arr[]=null;
		System.out.println(arr[1]);}
		// catch(NullPointerException ne) {System.out.println("NullPointer exception block");}
		//catch(Exception E) {System.out.println("Exception happend");}
		finally {System.out.println("Exception happend");}
		System.out.println("Hi");
		

	}

}
