package programs;

import java.util.Arrays;

public class SortElementsInArray {

	public static void main(String[] args) {
		int a[] = { 1,2,3,4,5};
			System.out.print("Before sorting"+Arrays.toString(a));
		
			for (int i = 0; i < a.length - 1; i++) { // for number of passes;
				for (int j = 0; j < a.length - 1; j++) { // for swaping
					if (a[j] < a[j + 1]) { // ascending means use the sign> 4,3,2,1 --> 1,2,3,4
						int temp = a[j];   // descending means use this sign < 1,2,3 --> 3,2,1
						a[j] = a[j + 1];
						a[j + 1] = temp;

					}

				}
			}
			System.out.println("\nAfter sorting : "+Arrays.toString(a));

		}

	}

