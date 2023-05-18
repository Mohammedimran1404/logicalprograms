package programs;
import java.util.Scanner;
public class Swaping_of_two_numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a and b values");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("before swapng A "+a+" B = "+b);
		int c=a; /* a=10, b=20 we want a=20 and b=10 so these logic is 
		         implemented c=a means 'a' value goes to 'c' and 'a' is empty 
		          and c get 10 same as follow for a=b means a=20 b is empty
		          b=c c value is 10 it goes to b so b=10 
		          so a=20 and b=10 */
		a=b;
		b=c;
		System.out.println("After swaping A "+a+" B = "+b);

	}

}
/* by using these logic also we can do
 a=a+b 10+20= 30
  b=a-b 30-20 = 10
  a=a-b 30-10=20
  */
