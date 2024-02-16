package org.threesevenpgms;

public class AmstrongNumberPgm {
	// Finding whether the given number is an amstrong number of not

	public static void main(String [] args){
	int a = 153, i = 0, j = 0 , n = a;

	while(a > 0){
	i = a % 10;
	j = j + (i * i * i);
	a = a / 10;}

	if(n == j){
	System.out.println("The given number " + n + " is an amstrong number");
	}else{
	System.out.println("The given number " + n + " is not an amstrong number");
	}
	}

}
