
public class SUmOFDig {
	
	public static void main(String[] args) {
		
		
		int sum =0;
		
		int num =1124;
		int prod=1;
		
		
		while(num!=0)
			
		{
			int last=num%10;
			sum= last+sum;
			prod=prod*last;
			
			
			num=num/10;
		}
		
		
		System.out.println("Sum of digit "+sum);
		System.out.println("Prod of digit "+prod);
	}

}
