package IfElse;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
		System.out.println("please input number to check :");
		 // int rem = n % 2 ;
		 if(num % 2 == 0){
			 System.out.println(num + " : the number is Even");
		 } else
			 System.out.println(num + ": the number is odd");
	}
}
