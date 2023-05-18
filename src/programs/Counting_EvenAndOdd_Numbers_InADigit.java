package programs;

public class Counting_EvenAndOdd_Numbers_InADigit {

	public static void main(String[] args) {
		int n=123456;
		int even_count=0;
		int odd_count=0;
		while(n>0) {
			int rem=n%10;
			if(rem%2==0) {
				even_count++;
			}
			else {
				odd_count++;
			}
			n=n/10;
		}
			System.out.println("Even numbers in a digit is : "+even_count);
			System.out.println("Odd numbers in a digit is : "+odd_count);


	}

}
