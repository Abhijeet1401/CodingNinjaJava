
package Patterns;
/*
A
BB
CCC
DDDD
 */
import java.util.Scanner;

public class AlphaPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while(i<=n){
			int j =1 ;
			//
			int startingChar = ((char)('A'+i-1));
			while(j<=i){
				System.out.print((char)(startingChar));
				j++;
			}
			System.out.println();
			i++;
		}

	}
}
