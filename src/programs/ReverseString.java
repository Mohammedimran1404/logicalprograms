package programs;

public class ReverseString {

	public static void main(String[] args) {
		String ip = "imran";
		String op = "";
		System.out.println(ip);
		for (int i = ip.length() - 1; i >= 0; i--) {
			op = op + ip.charAt(i);
		}
		System.out.println(op);
		if (ip.equals(op)) {
			System.out.println("is palindrome");
		} else {

			System.out.println("not a palindrome");
		}
	}

}
