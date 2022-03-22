import java.lang.*;
public class Rectangle extends Shape
{
	double length,width;
	Rectangle()
	{
		
	}
	Rectangle(double length,double width)
	{
		this.length=length;
		this.width=width;
	}
	public double area()
	{
		return length*width;
		
	}
}