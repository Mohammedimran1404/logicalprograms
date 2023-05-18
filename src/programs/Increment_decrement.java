package programs;

public class Increment_decrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2;
		int j = 3;
		int k = i++ + ++j + ++i + j-- + --i;
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);

	}

}
