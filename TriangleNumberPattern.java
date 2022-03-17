package Patterns;

import java.util.Scanner;

/*
Pattern for N = 4
1
22
333
4444
in this type of pattern we have to fix ith row and we  have to print "i"
 logic : while(i<=n){
          int j =1;
          while(j<=i){
          System.out.print(i);
          j++;
          }

          }
 */
public class TriangleNumberPattern {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int i = 1;
         while(i<=n){
         	int j = 1;
         	while(j<=i){
	            System.out.print(i);

	            j++;
            }
	         System.out.println();
         	 i++;
         }

	}
}
