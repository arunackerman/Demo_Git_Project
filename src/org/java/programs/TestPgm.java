package org.java.programs;

public class TestPgm {

	public static void main(String[] args) {
	     
		PasswordException pe = new PasswordException();
		try {
			((PasswordException) pe).verifyPassword("Arun Kumar Manivannan");
		} catch (PasswordException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Password is too short");
		}
				

	}

}
