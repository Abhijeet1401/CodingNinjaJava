
/*
    Write a program to calculate the total salary of a person.
    The user has to enter the basic salary (an integer) and
    the grade (an uppercase character), and depending upon which the total salary is calculated as -
    totalSalary = basic + hra + da + allow – pf
where :
hra   = 20% of basic
da    = 50% of basic
allow = 1700 if grade = ‘A’
allow = 1500 if grade = ‘B’
allow = 1300 if grade = ‘C' or any other character
pf    = 11% of basic.
Round off the total salary and then print the integral part only.

 */
package IfElse;

import java.util.Objects;
import java.util.Scanner;

public class TotalSalary {
	public static void main(String[] args) {
		int hra,da,pf;
				int allow=0;
		Scanner sc = new Scanner(System.in);
		int basicSalary = sc.nextInt();
		char grade = sc.next().charAt(0);
		Character.toUpperCase(grade);
		hra = 20 *basicSalary/100;
		da =  50*basicSalary/100;
		if(grade=='A')
			allow=1700;
		else if(grade=='B')
			allow=1500;
		else if(grade>='C' && grade<='Z')
			allow=1300;
		 pf=basicSalary*11/100;
		double totalSalary = basicSalary + hra + da + allow - pf;

		System.out.println(totalSalary);

	}
}
