package programs;

import java.util.Arrays;

public class Palindrome_Array {
	public static void main(String[] args) {
		int a[]= {1,2,1,};
		int i=0,j=a.length-1,temp;
		while(i<j) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
			System.out.println(Arrays.toString(a));
			if(i==j) {
				System.out.println("palindrome");
			}
			else {
				System.out.println("not a palindrome");

		}
			
	}

}
