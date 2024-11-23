package randomproglearning;

import java.util.Arrays;
import java.util.Scanner;

public class TwodArrayExample {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int [] []a= new int [2][3];
		
		
		for(int i=0;i<2;i++)
			
		{
			for(int j=0;j<a[i].length;j++)
				
			{
				a[i][j]= sc.nextInt();
			}
			//System.out.println(a);
		}
		//
		
for(int [] ar: a)
	
{
	System.out.println(Arrays.toString(ar));
}
	}

}
