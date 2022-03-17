package IfElse;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  n = sc.nextInt();
		int  i =1 ;
		int mul = 1;

		System.out.println("the multiplication table: ");
		 while(i<= 10){

		 	 mul  = n*i;
		 	 i = i+1;
			 System.out.println(mul);
		 }

	}
}
