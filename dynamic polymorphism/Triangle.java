import java.lang.*;
public class Triangle extends Shape
{
	double base,height;
	Triangle()
	{
		
	}
	Triangle(double base,double height)
	{
		this.base=base;
		this.height=height;
	}
	public double area()
	{
		return .5*base*height;
		
	}
}