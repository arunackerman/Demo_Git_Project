package org.threesevenpgms;

public class PaliPgm {
	public static void main(String [] args){
		int a = 121 , i = 0, j = 0, original;
		original = a;
		while(a > 0){

		i = a % 10;
		j = (j * 10) + i;
		a = a / 10;

		}

		if(original == j){
		System.out.println("The given number is palindrome");
		}else{

		System.out.println("The given number is not a palindrome");}
		}

}
