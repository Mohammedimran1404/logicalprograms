package programs;
import java.util.Scanner;
public class Area_of_rectangle {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the length of rectangle : ");
		  int length = scan.nextInt();
		System.out.print("Enter the width of rectangle : ");
		int width = scan.nextInt();
		int area = length*width;
		System.out.println("The area of reactangle is : " +area);
	}

}
