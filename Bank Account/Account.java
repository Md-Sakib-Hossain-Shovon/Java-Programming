class Account 
{
	private String accountNo;
	private double balance;
	Account()
	{
		
	}
	Account(String accountNo,double balance)
	{
		this.accountNo=accountNo;
		this.balance=balance;
	}
	void setAccountNo(String accountNo)
	{
		this.accountNo=accountNo;
	}
	void setBalance(double balance)
	{
		this.balance=balance;
	}
	public String getAccountNo()
	{
		return accountNo;
	}
	public double getBalance()
	{
		return balance;
	}
}
	
