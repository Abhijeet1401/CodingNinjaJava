package IfElse;

import java.util.Scanner;

public class FindPower {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		long power =1;

		while(x!=0){
			power= power*n;
			--x;
		}
		System.out.print(power);
	}
}
