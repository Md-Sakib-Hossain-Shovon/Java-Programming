import java.lang.*;
public class Customer
{
	
	private String name;
	private int nid;
	SavingsAccount sa;
	FixedAccount fa;
	
	public Customer()
	{
		
	}
	public Customer(String name,int nid,SavingsAccount sa,FixedAccount fa)
	{
		this.name=name;
		this.nid=nid;
		this.sa=sa;
		this.fa=fa;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setNid(int nid)
	{
		this.nid=nid;
	}
	public void setSavingsAccount(SavingsAccount sa)  
	{
		this.sa=sa;
	}
	public void setFixedAccount(FixedAccount fa)  
	{
		this.fa=fa;
	}
	
	
	public String getName()
	{
		return name;
	}
	public int getNid()
	{
		return nid;
	}
	public SavingsAccount getSavingsAccount()
	{
		return sa;
	}
	public FixedAccount getFixedAccount()  
	{
		return fa;
	}
	
}