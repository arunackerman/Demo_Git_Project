package org.java.programs;

public class PasswordException extends Exception {
	public void verifyPassword(String pwd) throws PasswordException {
		if(pwd.length()<8) {
			PasswordException pe = new PasswordException();
			throw pe;
		}
		else {
			System.out.println("Provide strong password");
		}
	}

	

}
