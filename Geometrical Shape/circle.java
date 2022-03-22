public class Circle extends shape
{
double radius;
Triangle () {}
Triangle (double radius)
{
super (radius, radius)
this.radius = radius;
}
void setRadius(double radius)
{ 
this.radius = radius;
}
double getRadius ()
{
return radius;
}
void displayArea()
{
System.out.println("Area = "+3.14*radius*radius);}
}