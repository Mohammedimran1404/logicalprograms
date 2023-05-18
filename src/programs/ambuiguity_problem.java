package programs;
public class ambuiguity_problem {
	public void add(int a,float b)
	{
		System.out.println("Result : "+(a+b));
	}
	
	public void add(float a ,int b)
	{
		System.out.println("Result : "+(a+b));	
	}



	public static void main(String[] args) {
		ambuiguity_problem c=new ambuiguity_problem();
		c.add(2.2f, 2);
		c.add(2, 3.2f);
		//c.add(2, 2);//The method add(int, float) is ambiguous for the type Calculation
	}

}

		
		

