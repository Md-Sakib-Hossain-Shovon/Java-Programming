import java.lang.*;
public class Student
{
	
	private String name;
	private String id;
	private double cgpa;
	Course courses[];
	
	public Student()
	{
		
	}
	
	public Student(String name,String id,double cgpa)
	{
		this.name=name;
		this.id=id;
		this.cgpa=cgpa;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setId(String i)
	{
		this.id=id;
	}
	public void setCgpa(double c)
	{
		this.cgpa=cgpa;
	}
	
	public void setCourse(Course c[])
	{
			courses=c;
		
	}
	public void getCourse()
	{
		int count=courses.length;
		System.out.println("You have "+count+ " Courses");
		for(int i=0;i<courses.length;i++)
		{
		System.out.println("Course name is: "+courses[i].getCname());
		System.out.println("Course id is: "+ courses[i].getCid());
		}
	}
	
	
	public String getName()
	{
		return name;
	}
	public String getId()
	{
		return id;
	}
	public double getCgpa()
	{
		return cgpa;
	}
	public void showDetails()
	{
		System.out.println("Name is : "+name);
		System.out.println("Id is : "+id);
		System.out.println("Cgpa is : "+cgpa);
		
				
	}
}