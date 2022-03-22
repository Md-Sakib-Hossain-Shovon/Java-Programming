class SavingsAccount extends Account
{
	double interestRate;
	SavingsAccount()
	{
		
	}
	SavingsAccount(String accountNo,double balance,double interestRate)
	{
		super(accountNo,balance);
		
		this.interestRate=interestRate;
	
		
	}
		void setInterestRate(double interestRate)
		{
			this.interestRate=interestRate;
		}
		double getInterestRate()
		{
			return interestRate;
		}
}