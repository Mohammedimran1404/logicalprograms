package programs;

public class Addition_of_twonumbers {
	 int a;
	 int b;
	int c;
	public int firstnumber() {
		 a = 20;
		return a;
	}

	public int secondnumber() {
		 b = 10;
		return b;
	}

	public void additionoftwonumbers() {
		 c = a + b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		Addition_of_twonumbers obj = new Addition_of_twonumbers();
	  obj.firstnumber();
		 obj.secondnumber();
		 obj.additionoftwonumbers();
	}
}
