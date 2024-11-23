import java.util.Scanner;

public class AbsoluteNumberCheck {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
	System.out.println("Please enter your number");
	
	int num=sc.nextInt();
	
	int result= num>=0? num :-num;
	
	
	System.out.println("Absolutre value is "+result);
		
	}

}
