import java.lang.*;
public class Start
{
	public static void main(String args[])
	{
		/*
		Shape s1=new Shape();
		System.out.println(s1.area());
		Triangle t1=new Triangle(10,10);
		System.out.println(t1.area());
		Rectangle r1=new Rectangle(10,10);
		System.out.println(r1.area());
		*/
		/*
		Shape s1=new Shape();
		System.out.println(s1.area());
		Shape s2=new Triangle(10,10);
		System.out.println(s2.area());
		Shape s3=new Rectangle(10,10);
		System.out.println(s3.area());
		*/
		/*
		Shape s[]= new Shape[3];
		s[0]= new Shape();
		s[1]= new Triangle(10,10);
		s[2]= new Rectangle(10,10);
		/*
		System.out.println(s[0].area());
		System.out.println(s[1].area());
		System.out.println(s[2].area());
		
		for(int i=0;i<3;i++)
		{
		System.out.println(s[i].area());
	
		}
		*/
		//Shape s=new Shape();
		
		
		
		
		Rectangle r1=new Rectangle(10,10);
		Triangle t1=new Triangle(10,5);
		Circle c1=new Circle(1);
		System.out.println(r1.area());
		System.out.println(t1.area());
		System.out.println(c1.area());
		
		Shape s1=new Rectangle(10,10);
		System.out.println(s1.area());		
	}
	
}