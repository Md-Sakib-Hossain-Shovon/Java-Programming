class FixedAccount extends Account
{
	double tenureYear;
	FixedAccount()
	{
		
	}
	FixedAccount(String accountNo,double balance,double tenureYear)
	{
		super(accountNo,balance);
		
		this.tenureYear=tenureYear;
	
		
	}
		void setTenureYear(double tenureYear)
		{
			this.tenureYear=tenureYear;
		}
		double getTenureYear()
		{
			return tenureYear;
		}
}