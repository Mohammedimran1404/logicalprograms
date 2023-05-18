package programs;
import java.util.Scanner;
public class Area_of_square {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the side of square : ");
		int s = scan.nextInt();
        int area = s*s;
		System.out.println("The area of square is : "+area);
		
		
		

	}

}
