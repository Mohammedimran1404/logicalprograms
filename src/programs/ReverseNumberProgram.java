package programs;

public class ReverseNumberProgram {

	public static void main(String[] args) {
		int n= 121;
		int temp=n;
		int rev=0;
		while(n>0) {
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);
		if(rev==temp) 
			System.out.println("is a palindrome");
		
			else 
				System.out.println("not a palindrome");
	}
	}


