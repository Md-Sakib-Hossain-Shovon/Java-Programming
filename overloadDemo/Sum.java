public class Sum
{
	public void add()
	{
		System.out.println("Empty add");
	}
	public void add(int a,int b)
	{
		int result= a+b;
		System.out.println("Adding two integer "+result);
	}
	public void add(double a,double b)
	{
		double result= a+b;
		System.out.println("Adding two integer "+result);
	}
	public void add(int a,double b)
	{
		double result= a+b;
		System.out.println("Adding one integer one double"+result);
	}
}
