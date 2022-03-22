public class Start
{
	public static void main(String args[])
	{
		Calculation c1=new Calculation();
		int x=10;
		int y=2;
		try{
		c1.division(x,y);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception is handled by main");
		}
		
	}
	
}