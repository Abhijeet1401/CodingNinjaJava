package Patterns;
/*
  Print the following pattern for the given N number of rows.
  Triangular star pattern for N = 4
*
**
***
****

 */
import java.util.Scanner;

public class Pattern08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;

		while(i<=n){
		    int j =1;
		    while(j<=i){
			    System.out.print("*");

			    j++;
			}
			System.out.println();
		    i++;
		}
	}

}
