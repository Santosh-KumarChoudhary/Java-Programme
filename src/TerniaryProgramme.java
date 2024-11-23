import java.util.Scanner;

public class TerniaryProgramme {
	
	public static void main(String[] args) {
		
		Scanner sc= new  Scanner(System.in);
		
		System.out.println("Please enter first number");
		int fnum=	sc.nextInt();
		
		System.out.println("Please netr the second number");
		
		int snum=sc.nextInt();
		
		
		
		int min=minimum(fnum,snum);
		
		System.out.println("Minimum number is "+min);

	
			
	
	}
	
	public static int minimum(int a, int b)
	
	{
		return a<b?a:b;
	}

}
