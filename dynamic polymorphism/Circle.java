import java.lang.*;
public class Circle extends Shape
{
	double radius;
	Circle()
	{
		
	}
	Circle(double radius)
	{
		this.radius=radius;
	}
	public double area()
	{
		return 3.14*radius*radius;
		
	}
}