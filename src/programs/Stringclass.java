package programs;

import java.util.Scanner;

public class Stringclass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = scan.nextLine();
		//System.out.println(s);
		StringBuffer s1 = new StringBuffer(s);
		 System.out.print(s1.reverse());
		

	}

}
