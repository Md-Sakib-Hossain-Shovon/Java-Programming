public class Customer
{
	private int nid;
	private String name;
	SavingsAccount sa;
	FixedAccount fa;
	Customer()
	{
		
	}
	Customer(int nid,String name,SavingsAccount sa,FixedAccount fa)
	{
		this.nid=nid;
		this.name=name;
		this.sa=sa;
		this.fa=fa;
	}
	void setNid(int nid)
	{
		this.nid=nid;
	}
	void setName(String name)
	{
		this.name=name;
	}
	void setSavingsAccount(SavingsAccount sa)
	{
		this.sa=sa;
	}
	void setFixedAccount(FixedAccount fa)
	{
		this.fa=fa;
	}
	int getNid()
	{
		return nid;
	}
	String getName()
	{
		return name;
	}
	SavingsAccount getSavingsAccount()
	{
		return sa;
	}
	FixedAccount getFixedAccount()
	{
		return fa;
	}
	}