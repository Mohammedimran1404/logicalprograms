package programs;

import java.util.Scanner;

public class Given_number_is_fibonacci {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number you want to find fibonacci : ");
		int ip = scan.nextInt();
		int firstterm = 0;
		int secondterm = 1;
		int thirdterm = 0;
		while (thirdterm < ip) {
			thirdterm = firstterm + secondterm;
			firstterm = secondterm;
			secondterm = thirdterm;
		}
		if (thirdterm == ip) {
			System.out.println("fibonacci series");
		} else {
			System.out.println("not a fibonacci");
		}
	}

}
