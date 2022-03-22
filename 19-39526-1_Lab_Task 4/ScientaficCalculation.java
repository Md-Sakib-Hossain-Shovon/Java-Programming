public class ScientaficCalculation
{
	int i=1;
	double result=1;
	double x;
	double y;
	
	ScientaficCalculation()
	{
		
	}
	
	ScientaficCalculation(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	double toThePow()
	{
			while(i<=y)
			{
				result = result*x;
				i++;
			}
			
			return result;
	}
	
}
