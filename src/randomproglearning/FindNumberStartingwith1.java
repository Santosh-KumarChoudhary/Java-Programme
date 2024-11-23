package randomproglearning;

import java.util.ArrayList;
import java.util.List;

public class FindNumberStartingwith1 {
	
	
	public static void main(String[] args) {
		
	int arr[]= {12,115,67,89};
		
		System.out.println(checkcum(arr));
		
		//System.out.println(getnumberstartingwith1(99));
	}
	
	public static  List<Integer> checkcum(int[] num)
	
	{
		
		List <Integer> onenumber= new ArrayList<>();
		
		for(int nu: num)
			
		{
			
			
		int num1=	getnumberstartingwith1(nu);
			if(num1==1)
			{
			onenumber.add(nu);
			
			}
			
		}
		
		return onenumber;
	}
	
	
	public static int getnumberstartingwith1(int num)
	
	{
		while(num>=10)
			
		{
			num=num/10;
		}
		
	
		
		
		return num;
		
	}
	
	
}