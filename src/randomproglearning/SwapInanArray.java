package randomproglearning;

import java.util.Arrays;

public class SwapInanArray {
	
	public static void main(String[] args) {
		
		int arr []= {10,12,1,3,14};
		
		swap(arr,0,4);
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void swap(int [] a, int a1, int b)
	
	{
		int temp= a[a1];
		a[a1]=a[b];
		
		a[b]=temp;
	}

}
