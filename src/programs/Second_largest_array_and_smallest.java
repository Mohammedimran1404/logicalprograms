package programs;

public class Second_largest_array_and_smallest {

	public static void main(String[] args) {
		int a[]= {1,200,40,50,700};
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(a[a.length-2]);

	}

}
/* if we change the length-3 we get the third largest
  to get smallest  we have change to < */
