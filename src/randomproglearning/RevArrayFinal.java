package randomproglearning;

import java.util.Arrays;

public class RevArrayFinal {
	
	public static void main(String[] args) {
		
		int ar[]= {1,2,3,4,5,6,7};
		rev(ar,0,6);
		
		System.out.println(Arrays.toString(ar));
		
		
		
	}
	
	public static void rev(int []a, int index1, int index2)
	
	{
		//int i=0;
		
		//int j=a.length-1;
	
			
		
		
		
		
		int temp=a[index1];
		
		a[index1]=a[index2];
		a[index2]=temp;
		
		
	}

}
