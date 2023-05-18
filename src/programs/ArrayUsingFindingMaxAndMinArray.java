package programs;

public class ArrayUsingFindingMaxAndMinArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int max=a[0];
		for(int i=1;i<=a.length-1;i++) {
			if(a[i]>max && a[i]%2==0) {
				max=a[i];
			}
		}
		System.out.println(max);

	}

}
