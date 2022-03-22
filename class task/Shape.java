import java.lang.*;
abstract public class Shape
{
	private double dim1;
	private double dim2;
	public Shape()
	{
		
	}
	public Shape(double dim1,double dim2)
	
	{
		this.dim1=dim1;
		this.dim2=dim2;
	}
	double getDim1()
	{
		return dim1;
	}
	double getDim2()
	{
		return dim2;
	}
	abstract void displayArea();
	
}