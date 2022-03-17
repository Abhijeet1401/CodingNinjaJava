/*
Write a program to print all the factors of a number other than 1 and the number itself.
 */
package IfElse;

import java.util.Scanner;

public class Factor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int d = 2;
		while(d<num){
			if(num % d==0 ){
				System.out.println(d);

			}
			d = d+1;
		}

	}
}
