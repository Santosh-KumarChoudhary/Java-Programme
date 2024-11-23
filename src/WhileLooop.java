import java.util.Scanner;

public class WhileLooop {
	
	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please enter your age :");
		
	int age=	sc.nextInt();
	
	while(age<0 || age>100)
		
	{
		//Scanner sc= new Scanner(System.in);
		
		System.out.println("Please re-enter your age :");

		
		 age=	sc.nextInt();
	}
	
	
	System.out.println("Your age is "+age);
		
		
		
	int num=1;
	
	while(num<100)
		
	{
		System.out.print(num + " ");
		num++;

	}
	
	}

}
