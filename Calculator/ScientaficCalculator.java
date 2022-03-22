public class ScientaficCalculator extends BasicCalculator
{
	double v1;
	double v2;
	double result;
	
	ScientaficCalculator()
	{
		
	}
	ScientaficCalculator(double v1, double v2)
	{
		super(v1,v2);
		this.v1=v1;
		this.v2=v2;
		
		ScientaficCalculation cal = new ScientaficCalculation(v1,v2);
		
		this.result = cal.toThePow();
	}
	
	
	public double add()
	{
		return v1+v2;
	}
	public double subtract()
	{
		return v1-v2;
	}
	public double multiply()
	{
		return v1*v2;
	}
	public double divide()
	{
		return v1/v2;
	}
	
	
	public double toThePower()
	{
		return result;
	}
	
}
