package Utils;

public class Employee {
	
	private String name;
	private int age;
	private double salary;
	
	
	
	
	//public Employee()
	
	
	
	
	public String getName()
	
	{
		return name;
	}
	
	 Employee(String name, int age, double salary) {
	
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public int getAge()
	
	{
		return age;
	}
	public double getSalary()
	
	{
		return salary;
	}
	
	
	public void setName(String name)
	
	{
		this.name=name;
	}
	public void setAge(int age)
	
	{
		this.age=age;
	}
	public void setSalary(double salary)
	
	{
		this.salary=salary;
	}
	
	String  getEmployeeDetails()
	
	{
		return "Name  : " +name+" ,age  : " + age  +" Salary :"+salary;
	}

}
