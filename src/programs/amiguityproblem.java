package programs;



public class amiguityproblem {
	public void add(int a,float b)
	{
		System.out.println("Result : "+(a+b));
	}
	
	public void add(float a ,int b)
	{
		System.out.println("Result : "+(a+b));	
	}



	public static void main(String[] args) {
		amiguityproblem c=new amiguityproblem();
		c.add(2.2f, 2);
		c.add(2, 3.2f);
		//c.add(2, 2);//The method add(int, float) is ambiguous for the type Calculation
	}

}

