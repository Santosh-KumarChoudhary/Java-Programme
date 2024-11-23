import java.util.Scanner;

public class switchclass {
	public static void main(String[] args) {
		
		
		Scanner sc =new Scanner(System.in);
		
		
		System.out.println("Welcome to the number selection");
		System.out.print("please entr your number to select the date  :");
		int  num=	sc.nextInt();

		
		switch (num)
		
		{
		case 1: System.out.println("Its a sunday");
		break;
		
		case 2: System.out.println("Monday");
		break;
		
		case 3: System.out.println("Tuesday");
		break;
		case 4: System.out.println("Wednesday");
		break;
		case 5: System.out.println("Thursday");
		break;	case 6: System.out.println("Friday");
		break;	case 7: System.out.println("Saturday");
		break;
		
		default :System.out.println("Invalid number entered");
	
		}
		
		//advace switch
		
		
		
				
				
	}

}
