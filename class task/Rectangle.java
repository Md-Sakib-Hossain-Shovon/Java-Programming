import java.lang.*;
public class Rectangle extends Shape
{
	private double length;
	private double width;
	public Rectangle()
	{
		
	}
	public Rectangle(double length,double width)
	
	{
		super(length,width);
	}
	void displayArea()
	{
		double area;
		area=getDim1()*getDim2();
		System.out.println("Area of rectangle is "+area);
	}
	
}