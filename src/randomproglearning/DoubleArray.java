package randomproglearning;

import java.util.Arrays;
import java.util.Scanner;

public class DoubleArray {
	
	public static void main(String[] args) {
	
		
		
		//Now take input from user
		
		Scanner sc = new Scanner(System.in);
		
		
	int [][] ar= new int [2][2];
	
	for(int row=0;row<ar.length;row++)
		
	{
		for(int column=0;column<ar[row].length	;column++)
			
		{
			
	 ar[row][column]=sc.nextInt();
		
		}
	}
	//System.out.println(Arrays.toString(ar));

	
	for(int a []:ar)
		
	{
		System.out.println(Arrays.toString(a));
	}
	
		
		
		
		
	}

}