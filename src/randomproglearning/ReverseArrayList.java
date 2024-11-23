package randomproglearning;

import java.util.Arrays;

public class ReverseArrayList {
	
	public static void main(String[] args) {
		
		
		int [] a= {1,2,3,4,5};
		
		reverse(a);
		
		System.out.println(Arrays.toString(a));
		
	}
	
	public static void reverse(int []a )
	
	{
		int start =0;
		
		int end=a.length-1;
		
	while(start<end)
		
	{
		int temp=a[start];//0
		a[start]=a[end];//5
		
		a[end]=temp;//0
		
		start++; //1
		
		end--; //4
	}
	

}
	
}
