class Start
{
	public static void main(String args[])
	{
		SavingsAccount s1=new SavingsAccount("22-223",777.45,2020);
		FixedAccount f1=new FixedAccount("11-223",666.45,2019);
		Customer c1=new Customer(1666,"Sakib",s1,f1);
		System.out.println("Customer Details");
		System.out.println("Nid num: "+c1.getNid());
		System.out.println("Name: "+c1.getName());
		System.out.println("FixedAccount details");
		System.out.println("Account Num: "+f1.getAccountNo());
		System.out.println("Balance "+f1.getBalance());
		System.out.println("TenureYear "+f1.getTenureYear());
		System.out.println("SavingsAccount details");
		System.out.println("Account Num: "+s1.getAccountNo());
		System.out.println("Balance "+s1.getBalance());
		System.out.println("TenureYear "+s1.getInterestRate());
	}
}