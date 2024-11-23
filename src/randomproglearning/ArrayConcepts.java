package randomproglearning;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayConcepts {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int [] a= new int [5];
		
	
		//a[5]=1;

		for(int i=0;i<a.length;i++)
			
		{
			System.out.print("Enter the didgit");

		
		a[i]=sc.nextInt();
			
			//System.out.println(a[i]);
		}
		
		a[1]=9000;
		System.out.println(Arrays.toString(a));
		
		
	}

}
