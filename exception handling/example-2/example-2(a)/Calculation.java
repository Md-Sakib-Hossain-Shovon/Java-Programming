public class Calculation
{
		void division(int x,int y)
		{
			int div=0;
			try{
			div=x/y;
			System.out.println("The value of div is: "+div);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("exception occured...");	
			}
			
			catch(ArithmeticException e)
			{
				System.out.println("exception occured...");
				
			}
			
			finally
			{
			System.out.println("Program exitting...");
			}
			
			
		}
}
	
