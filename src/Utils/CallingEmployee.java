package Utils;

public class CallingEmployee {
	
	public static void main(String[] args) {
		
	
	
	Employee emp =new Employee("San",30,1234455.0);
	
System.out.println(emp.getEmployeeDetails());
emp.setName("Bittu");

System.out.println(emp.getEmployeeDetails());
}
}