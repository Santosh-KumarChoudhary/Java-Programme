import java.util.Scanner;

public class SwitchAdditionSubs {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Please enter your first digit :");
		
		
		int num1= sc.nextInt();
		
		System.out.println("Now, enter your second didgit");
		
	int num2= sc.nextInt();
	
	System.out.println("Select the Operation :");
	
	String opt= sc.next();
	
	
	switch(opt)
	
	{
	case  "+" : System.out.println(num1+num2);
	break;
	
	case "-" : System.out.println(num1-num2);
	
	break;
	
	case "*" : System.out.println(num1*num2);
	
	case "/" : System.out.println(num1/num2);
	
	
	}
	}

}
