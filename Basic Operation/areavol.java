class shape{
	double length;
	double height;
	double width;
	shape(){
	}
		shape(double l,double h,double w){
		length=l;
		height=h;
		width=w;
	}
	
	shape(double l,double h){
		length=l;
		height=h;
	}
	shape(double l){
		length=l;
	}
		
	void setLength(double l){
		length=l;
	}
	void setHeight(double h){
		height=h;
	}
	void setWidth(double w){
		width=w;
	}
	double getLength(){
		return length;
	}
	double getHeight(){
		return height;
	}
	double getWidth(){
		return width;
	}
	double AreaRec()
	{
		return length*width;
	}
	double AreaSqr()
	{
		return length*length;
	}
	double VolRec()
	{
		return length*height*width;
	}
	double VolSqr()
	{
		return length*length*length;
	}
	
	public static void main(String args[]){
		shape s1=new shape(5,6,8);
		s1.setLength(5);
		s1.setHeight(6);
		s1.setWidth(8);
		System.out.println(s1.getLength());
		System.out.println(s1.getHeight());
		System.out.println(s1.getWidth());
		System.out.println("Area Of Rectangle:"+s1.AreaRec());
		System.out.println("Area Of Square:"+s1.AreaSqr());
		System.out.println("Volume Of Rectangle:"+s1.VolRec());
		System.out.println("Volume Of Square:"+s1.VolSqr());
	}
}