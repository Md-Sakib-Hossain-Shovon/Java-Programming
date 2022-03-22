public class Start
{
	public static void main(String args[])
	{
		FixedAccount f1=new FixedAccount("a-1",1000,1);
		SavingsAccount s1=new SavingsAccount("a-2",2000,2);
		Customer c1=new Customer("ahona",111,s1,f1);
		System.out.println("Name is :"+c1.getName());		
		System.out.println("nid is :"+c1.getNid());
		System.out.println("interest rate is :"+c1.getSavingsAccount().getInterestRate());
		System.out.println("tenure year is :"+c1.getFixedAccount().getTenureYear());
		System.out.println("your savings accountno is: "+c1.getSavingsAccount().getAccountNo());
		System.out.println("your fixed accountno is: "+c1.getFixedAccount().getAccountNo());
		System.out.println("your savings account balance is: "+c1.getSavingsAccount().getBalance());
		System.out.println("your fixed account balance  is: "+c1.getFixedAccount().getBalance());
	}
	
}