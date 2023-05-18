package programs;

public class FindingMaxArray {

	public static void main(String[] args) {
		int a[]= {10,20,30,60,50};
		int max=a[0];
		for(int i=1;i<=a.length-1;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("maximum of an array is : "+max);

	}

}
