import java.util.Scanner;

public class Start
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);

		double num1;
		double num2;
		
		System.out.print("Enter num1: ");
		num1=input.nextDouble();
		
		System.out.print("Enter num2: ");
		num2=input.nextDouble();
		
		
		ScientaficCalculator ob1 = new ScientaficCalculator(num1, num2);
		
		System.out.println("Addition: "+ob1.add());
		System.out.println("Subtract: "+ob1.subtract());
		System.out.println("Multipication: "+ob1.multiply());
		System.out.println("Divide: "+ob1.divide());
		System.out.println(+ob1.toThePower());
	}
	
}
