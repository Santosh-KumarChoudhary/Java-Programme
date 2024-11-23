package randomproglearning;

import java.util.Arrays;

public class ArrayChange {
	
	public static void main(String[] args) {
		
		int [] a= {1,2,4,5}	;
		System.out.println(Arrays.toString(a));

		
		change(a);
		
		System.out.println(Arrays.toString(a));
	}
	
	public static void change(int [] a)
	
	{
		a[0]=13;
	}

}
