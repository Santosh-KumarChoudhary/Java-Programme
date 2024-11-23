import java.util.ArrayList;

public class Test1 {
	//static int [] intList= {1,2,3,4,5,6,7,8,9,10};
public static void main(String[] args) {
		
		swap();
		String name ="Santosh Kumar Ch";
		int length =name.length();
		System.out.println("length is "+length);
		char[] arr=name.toCharArray();
		for(int i=length-1;i>=0;i--)
		{
			
		System.out.print(arr[i]);
		//System.out.println;
System.out.println(i);
//System.out.println(length);



		}
	}
	
	public static void swap()
	
	
	
	{
		
		int a=10;
		int b=20;
		System.out.println("Before Swapped value of a"+a+ " and b:  "+b);

		b=b-a;
		a=a+b;
		System.out.println("Swapped value of a"+a+ " and b:  "+b);
		
		String name= "San tosh kumar";
		System.out.println(name.replaceAll(" ", ""));
	//	name.replaceAll(" ", "");
		//String [] split=name.split(" ");
		//System.out.println(split);
		
	int randomNumber=	(int) Math.random();
	System.out.println(" randomNumber is "+randomNumber);
	double a1= randomNumber;
	System.out.println("random "+a1);
	
	final int a11;
	
	a11=90;
	System.out.println("fianl value "+a11);

	//
	//	a11=90;
		
	}
	

	
	
}
		
	//	This code first creates an ArrayList of integers and adds some elements to it. It then finds the index of the desired element (in this case, 3) using the indexOf method. It creates a new ArrayList for the remaining elements and adds them to the new ArrayList using a loop. Finally, it prints the remaining elements.

		//Note that this approach will only work if the desired element is present in the ArrayList. If the element is not present, the indexOf method will return -1, and the loop will not be executed.




	


