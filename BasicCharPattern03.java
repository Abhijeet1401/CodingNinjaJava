package Patterns;

import java.util.Scanner;

public class BasicCharPattern03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while(i<=n){
			int j =1;
			int startingChar =(char)('A'+1-1);
			while(j<=n){
				System.out.print((char)startingChar);

				j++;
			}
			System.out.println();
			i++;

		}
	}
}
