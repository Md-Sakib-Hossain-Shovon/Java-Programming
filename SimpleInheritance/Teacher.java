public class Teacher extends Person
{
	private double salary;
	private String id;
	Teacher()
	{
		System.out.println("Inside child constructor");
	}
	Teacher(String name,int age,String gender,double salary,String id)
	{
	super(name,age,gender);
	this.salary=salary;
	this.id=id;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public void setId(String id)
	{
		this.id=id;
	}
	public double getSalary()
	{
		return salary;
	}
	public String getId()
	{
		return id;
	}
	public void showInfo()
	{
		System.out.println("Salary is :"+salary);
		System.out.println("id is :"+id);
		System.out.println("Name is :"+getName());
		System.out.println("Age is :"+getAge());
		System.out.println("gender is :"+getGender());

	}
}