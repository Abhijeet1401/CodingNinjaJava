package Patterns;

import java.util.Scanner;

public class BasicPattern01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1; // where i th row for n column is the
		while(i<=n){
			int j =1;
			while(j<=n){
				System.out.print("*"+" ");
				j++;
			}
			System.out.println();
			i++;

		}

	}
}
