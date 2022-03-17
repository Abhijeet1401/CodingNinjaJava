package Patterns;

import java.util.Scanner;

public class Pattern07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		int counter = 1;
		while(i<=n){
			int j =1;
			while(j<=n){
				System.out.print(counter+" ");
				counter++;
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
