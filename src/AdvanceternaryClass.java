import java.util.Scanner;

public class AdvanceternaryClass {
	//>=80 //high
	//>50->moderate
	//<50 -> low
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your numbers");
		
	 int num=  sc.nextInt();
		
		
		
		String result = num>=80 ?"High" :(num>50 ?"Moderate ":"low");
		
		System.out.println("Score is "+result);
		
		
		
	}

}
