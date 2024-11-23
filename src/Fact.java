import java.util.Scanner;

public class Fact {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Please enter the number : ");
		
		int num= sc.nextInt();
		
		System.out.println(factIteration(num));
	}
	
	public static long factIteration( int num)
	
	{
		long result =1;
		for(int i=1;i<=num;i++)
			
		{
			result*=i;
		}
		return result;

	}

}
