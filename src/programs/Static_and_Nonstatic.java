package programs;

public class Static_and_Nonstatic {
	int a = 2; // non static variable
	static int b = 4; // static variable

	public static void main(String[] args) {
		System.out.println("b =" + b); //  static 
		Static_and_Nonstatic obj = new Static_and_Nonstatic(); // object created because non static cannot move to static
		System.out.println("a ="+obj.a); // static 
		 

	}
	

}
