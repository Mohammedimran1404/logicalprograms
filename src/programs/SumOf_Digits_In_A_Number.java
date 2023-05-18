package programs;

public class SumOf_Digits_In_A_Number {

	public static void main(String[] args) {
		int n=12342;
		int sum=0;
		while(n>0) {
			sum = sum+n%10;
			n=n/10;
		}
		System.out.println("The sum of digits in a number is : "+sum);
		

	}

}
