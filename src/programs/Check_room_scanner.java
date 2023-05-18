package programs;
import java.util.Scanner;
public class Check_room_scanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Your Hall Ticket No : ");
		int ht = scan.nextInt();
		if(ht>=100 && ht<=200) {
			System.out.println("Your seat is in room no 1 ");
		}
		else if (ht>=201 && ht<=300) {
			System.out.println("Your seat is in room no  2 ");
		}
		else if (ht>=301 && ht<=400) {
			System.out.println("Your seat is in room no 3 ");
		}
		else {
			System.out.println("You have entered wrong Hall Ticket No, please check it");
		}
	}

}
