public class Triangle extends shape
{
double base; 
double height;
Triangle () {}
Triangle (double base, double height) 
{
super (base, height)
this.base = base;
this.height = height;
}
void setBase(double base)
{
this.base = base;
}
void setHeight(double height)
{ 
this.height= height;
}
double getBase ()
{
return base;
}
double getHeight()
{
return height;
}
void displayArea()
{ 
System.out.println("Area = "+0.5*base*height);}
}