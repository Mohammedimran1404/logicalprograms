package programs;
import java.util.Scanner;


public class Scanner_class {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter name ");
	String name = scan.nextLine();
	System.out.println("Enter age : ");
	int age = scan.nextInt();
	System.out.println("Enter email address : ");
	String email = scan.next();
	System.out.println("Enter college name : ");
	String college = scan.next();
	System.out.println("Name : "+name);
	System.out.println("Age : "+age);
	System.out.println("Email address : "+email);
	System.out.println("College name : "+college);
	}

}
