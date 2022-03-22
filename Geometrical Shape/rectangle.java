public class Rectangle extends shape
{
double length; 
double width;
Rectangle () {}
Rectangle (double length, double width) 
{super (length, width)
this.length = length;
this.width = width;

}
void setLength(double length)
{ this.length = length;}
void setWidth (double width)
{ this.width = width;}
double getLength ()
{ return length;}
double getWidth()
{ return width;}
void displayArea()
{ System.out.println("Area = "+length*width);}
}