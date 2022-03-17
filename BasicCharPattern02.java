package Patterns;

import java.util.Scanner;

public class BasicCharPattern02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while(i<=n){
			int j = 1;
			int startingNumber =(char)('A'+i-1);
			while(j<=n){
				System.out.print((char)(startingNumber));//System.out.print((char)(startingNumber+1))
				startingNumber++;
				j++;
			}
			System.out.println();
			i++;
		}

	}
}
