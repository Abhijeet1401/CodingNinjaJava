package IfElse;

import java.util.Scanner;

public class LargestOfThree {
	public static void main(String[] args) {
		int a ,b,c;
		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if(a>b && a>c){
			System.out.println(a+":a is largest");
		}else if(b>c && b>a){
			System.out.println(b+ ":b is largest");
		} else
			System.out.println(c+":c is largest");

	}
}
