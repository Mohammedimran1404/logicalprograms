package programs;

public class SumOfArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int sum=0;
		for(int i=0;i<=a.length-1;i++) {
			System.out.print(a[i]+" ");
			sum=sum+i;

		}
		System.out.print("\n"+"sum of an array is : ");
		System.out.println(sum);
		System.out.println(a.length);


	}

}
