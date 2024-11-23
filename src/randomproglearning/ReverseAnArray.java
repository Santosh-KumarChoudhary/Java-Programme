package randomproglearning;

import java.util.Arrays;

public class ReverseAnArray {
	
	public static void main(String[] args) {
		
		int arr[]= {13,15,87,89,12};
		
	int start= arr[0];
	
	int end= arr.length-1;
	
	while(start<end)
	{
		
		swap(arr,start,end);
		
		start++;
		end--;
		
		
		System.out.println(Arrays.toString(arr));
		
	}
		
	}
	
	
	
	public static void swap(int []a, int index1, int index2)
	
	{
		int temp=a[index1];
		
		a[index1]=a[index2];
		
		a[index2]=temp;
	}

}
