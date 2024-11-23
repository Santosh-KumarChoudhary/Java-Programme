import java.util.Scanner;

public class OddEvenUsingEternary {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your number to check :");
		
	int num=	sc.nextInt();
	
String result =	num%2==0?"Even ":"Odd";

System.out.println("Number is  "+result);
		
		
	}

}
