package trycatch;

import java.util.Scanner;

public class ArithmeticsEx {
	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Welcome to the division");
		
		System.out.println("please enter your numbers");
		
	int fnum=	input.nextInt();
	int snum=input.nextInt();
	
	try {
	
	int sum=fnum/snum;
	System.out.println("result is "+sum);

	}
	
	catch(ArithmeticException e)
	
	{
		
		System.out.println(e.getMessage()+"\n enter valid numbers ");
		//System.out.println("Divided by zero, plz enter greater than 0");
	}
	
	
	
		
		
	}

}
