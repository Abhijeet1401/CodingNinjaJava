/*
 Write a program to input an integer N and print the sum of all its even digits
 and sum of all its odd digits separately.
Digits mean numbers, not the places! That is,
if the given integer is "13245", even digits are 2 & 4 and odd digits are 1, 3 & 5.
 */

package IfElse;

import java.util.Scanner;

public class SumOFEvenOdd {
	public static void main(String[] args) {
		int SumEven = 0;
		int SumOdd = 0;

		 int remainder;

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		while(N >0){
			int n;
			remainder = N % 10;
			if(remainder % 2 == 0){
				SumEven = SumEven + remainder;
			}
			if(remainder % 2 !=0){
				SumOdd = SumOdd + remainder;
			}
			N = N/10;

		}

		System.out.print(SumEven+" "+SumOdd);


	}
}
