public class leapyear
{
	public static void main(String args[])
	{
		int year=2012;
		if(year%4==0 && year%100!=0)
		{
			System.out.println("Leap Year");
		}
		else if(year%400==0)
		{
			System.out.println("Leap Year");
		}
		else
			System.out.println("Not Leap Year");
	}
}