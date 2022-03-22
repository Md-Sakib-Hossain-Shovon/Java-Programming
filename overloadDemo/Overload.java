public class Overload
{
	int var;
	Overload()
	{
		System.out.println("empty Overload");
	}
	Overload(int var)
	{
		this.var=var;
	}
	void showInfo()
	{
		System.out.println("inside overload show");
	}
	void showInfo(int var)
	{
		System.out.println("inside overload show parameter"+var);
	}
}