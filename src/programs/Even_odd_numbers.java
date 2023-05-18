package programs;

import java.util.Scanner;

public class Even_odd_numbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number you want to check : ");
		int i = scan.nextInt();
		if (i % 2 == 0) {
			System.out.println(i + " is a even number 👍 ");
		} else {
			System.out.println(i + " is a odd number 👍 ");
		}
	}
}
