package programs;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the year : ");
		int year= scan.nextInt();
		if(year%4==0 || year%400==0) {
			System.out.println("leap year");
		}
		else {
			System.out.println("not a leap year");
		}
		

	}

}
