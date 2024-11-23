import java.util.Scanner;

public class DoWhilePasswordCheck {
	public static void main(String[] args) {
		
		String pwd="";
		Scanner sc = new Scanner (System.in);
	//	System.out.println("Please enter your password");
		
	do {
		System.out.println("Please neter your password");
		 pwd=	sc.next();

	}
	while(!pwdcheck(pwd));
	System.out.println("Your password has been accepted");
	
		
	}
	
	public static boolean pwdcheck(String pwd)
	
	{
		return pwd.length()>6;
	}

}
